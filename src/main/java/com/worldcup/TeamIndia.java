package com.worldcup;

public class TeamIndia {
	
	private String Captain;
	private String viceCaptain;
	private String wicketKeeper;
	private String batsmen;
	private String bowler;
	
	public String getBatsmen() {
		return batsmen;
	}
	public void setBatsmen(String batsmen) {
		this.batsmen = batsmen;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;

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
