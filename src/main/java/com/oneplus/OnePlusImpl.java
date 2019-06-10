package com.oneplus;

public class OnePlusImpl {
	
	private String mobileModel;

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	
	
	public static void main(String[] args) {
		
		OnePlusImpl oi=new OnePlusImpl();
		oi.setMobileModel("120-124-125");
		
		
		System.out.println(oi.getMobileModel());
		
		
		
	}

}
