package com.acer;

public class AcerJava {
	
	
	
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
	
	public static void main(String[] args) {
		AcerJava aj=new AcerJava();
		aj.setLaptopName("ACER");
		aj.setLaptopRam("4gb");
		aj.setLaptopVersion("i3");
		
		System.out.println(" computer detials are" +aj.getLaptopName()+ " "+ aj.getLaptopRam()+ " "+aj.laptopVersion);
	}

	
	
}
