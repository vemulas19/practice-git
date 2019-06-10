package com.acer;

public class AcerJava {
	
	

	private String modelName;
	private String ramCapacity;
	private String laptopName;
	private String laptopRam;
	private String laptopVersion;
	
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	public String getLaptopRam() {
		return laptopRam;
	}
	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}
	public String getLaptopVersion() {
		return laptopVersion;
	}
	public void setLaptopVersion(String laptopVersion) {
		this.laptopVersion = laptopVersion;
	}
	
	
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
		aj.setRamCapacity("6 GB RAM    ");
		aj.setLaptopName("ACER");
		aj.setLaptopRam("4gb");
		aj.setLaptopVersion("i3");
		
		System.out.println(aj.getModelName()+"--"+aj.getRamCapacity());
		System.out.println(" computer detials are" +aj.getLaptopName()+ " "+ aj.getLaptopRam()+ " "+aj.laptopVersion);
		
	}

}
