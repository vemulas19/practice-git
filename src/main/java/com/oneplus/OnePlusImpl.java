package com.oneplus;

import org.apache.log4j.chainsaw.Main;

public class OnePlusImpl {
	
	private String mobileIMEI;
	private String mobileCompany;
	
	public String getMobileIMEI() {
		return mobileIMEI;
	}
	public void setMobileIMEI(String mobileIMEI) {
		this.mobileIMEI = mobileIMEI;
	}
	public String getMobileCompany() {
		return mobileCompany;
	}
	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}
	
	public static void main(String[] args) {
		
		OnePlusImpl oi = new OnePlusImpl();
		oi.setMobileCompany("Samsung");
		oi.setMobileIMEI("123-456-789");
		
		System.out.println(oi.getMobileCompany()+" "+oi.getMobileIMEI());
		
	}

}
