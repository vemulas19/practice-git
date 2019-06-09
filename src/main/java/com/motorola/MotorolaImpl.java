package com.motorola;

public class MotorolaImpl {
	
	private String Model;
	
	private String SerialNo;

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}
	
	public static void main(String[] args) {
		
		MotorolaImpl mo=new MotorolaImpl();
		
		mo.setModel("G4");
		mo.setSerialNo("1234567895235625");
		
		System.out.println(mo.getModel()+"----"+mo.SerialNo);
		
		
		
		
	}

}
