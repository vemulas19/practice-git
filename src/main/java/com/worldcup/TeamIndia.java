package com.worldcup;

public class TeamIndia {
	
	private String Captain;
	private String viceCaptain;
	private String wicketKeeper;
	private String Keeper;
	private Integer bowler_Count;
	
	
	
	
	
	public String getKeeper() {
		return Keeper;
	}
	public void setKeeper(String keeper) {
		Keeper = keeper;
	}
	public Integer getBowler_Count() {
		return bowler_Count;
	}
	public void setBowler_Count(Integer bowler_Count) {
		this.bowler_Count = bowler_Count;
	}
	public String getCaptain() {
		return Captain;
	}
	public void setCaptain(String captain) {
		Captain = captain;
	}
	public String getViceCaptain() {
		return viceCaptain;
	}
	public void setViceCaptain(String viceCaptain) {
		this.viceCaptain = viceCaptain;
	}
	public String getWicketKeeper() {
		return wicketKeeper;
	}
	public void setWicketKeeper(String wicketKeeper) {
		this.wicketKeeper = wicketKeeper;
	}
	
	
	public static void main(String[] args) {
		
		
		TeamIndia india = new TeamIndia();
		
		india.setCaptain("Rohith ");
		india.setCaptain("Kohli");
		
		
		
		System.out.println(india.getCaptain()+"--"+india.getViceCaptain());
		
		
		
	}

}
