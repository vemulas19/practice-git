package com.employee;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.whatsapp.daoImpl.LoginDaoImpl;
import com.whatsapp.pojo.User;

import validation.validations;

@Controller
public class UserController {

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUserInformation(@RequestParam("mailIdToDelete") String mailId, Model model) {
		System.out.println("deleteUser triggered!!" + mailId);

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("delete from User where mailid = :mail");
		query.setParameter("mail", mailId);
		query.executeUpdate();

		session.beginTransaction().commit();

		// Fetching updated user records from database and setting it into model
		// object
		Query queryAllUsers = session.createQuery("from User");
		List<User> userList = queryAllUsers.list();
		model.addAttribute("uList", userList);

		session.close();

		return "profile";
	}

	@RequestMapping(value = "/editView", method = RequestMethod.POST)
	public String editView(@RequestParam("mailId") String mailId, Model model) {
		System.out.println("triggered edit view: " + mailId);

		System.out.println("select *from User where mailId=" + mailId);

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Query queryByMailId = session.createQuery("from User where mailid = :mailId");
		queryByMailId.setParameter("mailId", mailId);
		List<User> userList = queryByMailId.list();

		model.addAttribute("userObj", userList.get(0));

		return "editUser";
	}

	@RequestMapping(value = "/updateUser")
	public String updateUserDetails(com.media.User user, Model model) {
		System.out.println("updateUserDetails method triggered");
		System.out.println(user.getName());
		System.out.println(user.getMobile());
		System.out.println(user.getMailid());
		System.out.println(user.getCity());
		System.out.println(user.getPword());

		validations val = new validations();
		if (user.getCity() == null) {

			System.out.println("city should not be null");
			return "register";
		}

		if (user.getUserId() == 0) {
			System.out.println("userid should not be zero or null");
			return "register";
		}
		boolean isValidMailId = val.isValidMailId(user.getMailid());

		if (!isValidMailId) {
			model.addAttribute("message", "invalid mail id  entered");
			return "register";
		}

		if (user.getPassword() == null || user.getPassword().isEmpty()) {
			return "register";
		}

		// mobileNumber validation
		boolean isValidMobile = val.isValidMobile(user.getMobile());

		if (!isValidMobile) {
			model.addAttribute("message", "invalid mobile number entered");
			return "register";
		}

		// name validation
		if (user.getUserName() == null || user.getUserName().isEmpty()) {
			return "loginFail";
		}

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		session.update(user);
		session.beginTransaction().commit();

		// Fetching updated user records from database and setting it into model
		// object
		Query queryAllUsers = session.createQuery("from User");
		List<User> userList = queryAllUsers.list();
		model.addAttribute("uList", userList);

		session.close();
		return "profile";
	}

	@RequestMapping(value = "/fetchAllRecords")
	public String getAllRecords(Model model) {
		LoginDaoImpl dao = new LoginDaoImpl();
		List<User> allUsers = dao.getAllUsers();
		model.addAttribute("uList", allUsers);
		return "profile";
	}

}
