package com.prac;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojos.SpringPojo;

public class UpdateController {
	@RequestMapping(value="/updateUser")
	public String updateController(SpringPojo sj,Model model){
		System.out.println("update triggered for  "+sj.getMail());
		System.out.println(sj.getName());
		System.out.println(sj.getMob());
		 boolean valid =Validations.isValid(sj.getMail());
		if(!valid){
	   System.out.println("please enter valid details");
	    return "register";
		}else{
			return "login";
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
}
