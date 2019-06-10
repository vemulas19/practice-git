package com.acer;

public class AcerJava {
	
	
	private String modelName;
	private String ramCapacity;
	
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(String ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	
	public static void main(String[] args) {
		
		AcerJava aj=new AcerJava();
		
		aj.setModelName("AspireE1531");
		aj.setRamCapacity("6 GB RAM");
		
		System.out.println(aj.getModelName()+"--"+aj.getRamCapacity());
		
	}
	
	

}
