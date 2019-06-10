package com.media;

public class Whatsapp1 {

	public String saveUser(User user) {
		System.out.println("Username is : " + user.getUserName());

		System.out.println("City is : " + user.getCity());
		return "success";
	}
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("sum is"+c);
		return c;
	}
	
	public int sub(int a, int b) {
		int c = a-b;
		System.out.println("sub is : " + c);
		return c;
	}
	
	public int multiply(int a, int b) {
		int c = a*b;
		System.out.println("multiplication is : " + c);
		return c;
	}
}
