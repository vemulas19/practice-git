package com.media;

public class Whatsapp1 {

	public String saveUser(User user) {
		System.out.println("Username is : " + user.getUserName());

		System.out.println("City is : " + user.getCity());
		return "success";
	}
	
	public static void main(String[] args) {
		System.out.println("test main");
	}
}
