package com.twitter;

public class Registercontroller {

	public static void main(String[] args) {
		save();

	}

	private static String save() {
		System.out.println("welcome to Twitter Registration Page");
		TwitterPojo t = new TwitterPojo();
		t.setUserName("Stash");
		t.setPassword("*****");
		t.setMobileNumber("49863589627");
		t.setCity("Miyapur");
		t.setLocation("Medchal");
		t.setPinCode(500072);
		
		System.out.println("stsh check begins");
		System.out.println(t.getUserName()+"||"+t.getMobileNumber()+"||"+t.getLocation()+"||"+t.getPinCode());
		return "Login";

	}

}
