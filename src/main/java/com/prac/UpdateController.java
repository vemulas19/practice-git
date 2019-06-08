package com.prac;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojos.SpringPojo;

public class Mavenmobile {
	public Boolean isValidMobile(String number){
		  Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}" ); 
		   
	      Matcher m = p.matcher(number); 
	      return (m.find() && m.group().equals(number)); 

}

public class UpdateController {
	@RequestMapping(value="/updateUser")
	public String updateController(SpringPojo sj,Model model){
		System.out.println("update triggered for  "+sj.getMail());
		System.out.println(sj.getName());
		System.out.println(sj.getMob());
		
		boolean isValidMobile = val.isValidMobile(user.getMobile());

		if (!isValidMobile) {
			model.addAttribute("message", "invalid mobile number entered");
			return "register";
		}
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.update(sj);
		session.beginTransaction().commit();

		Query display = session.createQuery("from SpringPojo");
		List<SpringPojo> list = display.list();
		model.addAttribute("userList", list);
		
			
		session.close();
		return "profile";
	
}
