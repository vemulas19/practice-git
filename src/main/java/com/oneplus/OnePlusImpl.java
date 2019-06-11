package com.oneplus;

import org.apache.log4j.chainsaw.Main;

public class OnePlusImpl {
	

	private String mobileIMEI;
	private String mobileCompany;
	private String mobileModel;
	
	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	
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
		oi.setMobileModel("120-124-125");
		
		System.out.println(oi.getMobileCompany()+" "+oi.getMobileIMEI());
		System.out.println(oi.getMobileModel());
		
	}

}
