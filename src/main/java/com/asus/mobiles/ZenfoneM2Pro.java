package com.asus.mobiles;

public class ZenfoneM2Pro {
	
	private String mobileName;
	private Integer mobileModel;
	
	
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Integer getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(Integer mobileModel) {
		this.mobileModel = mobileModel;
	}
	
	

	
	public static void main(String[] args) {
		
		ZenfoneM2Pro zn=new ZenfoneM2Pro();
		zn.setMobileName("Asus");
		zn.setMobileModel(2345);
		
		System.out.println(zn.getMobileName()+"--"+zn.getMobileModel());
		
		
	}
}
