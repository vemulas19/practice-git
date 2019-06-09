package com.employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidation {
	public static boolean isValidMailId(String mailId){
		System.out.println("entered in to is valid mail!!"+mailId);
		 
		Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$"); 
     
		
		 Matcher m=p.matcher(mailId);
		 
		 boolean ismatch = m.matches();
		
		 System.out.println("exited in to isvalid mail!!"+mailId);
		
		return ismatch;
		
	}

}


}
