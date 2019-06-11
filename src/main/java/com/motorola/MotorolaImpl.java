package com.motorola;

public class MotorolaImpl {
	
	private String imei;
	private String number;
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	public static void main(String[] args) {
		
		
		MotorolaImpl mp=new MotorolaImpl();
		
		mp.setImei("120-120-2013");
		mp.setNumber("102102102");
		
		System.out.println(mp.getImei()+"--"+mp.getNumber());
		
	}

}
