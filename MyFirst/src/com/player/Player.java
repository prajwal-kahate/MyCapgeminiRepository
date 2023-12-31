package com.player;

public class Player {
	private String playerName;
	private String country;
	private String skills;
	
	
	public Player(String playerName, String country, String skills) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.skills = skills;
	}
	public Player() {
		super();
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getskills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", country=" + country + ", skills=" + skills + "]";
	}
	
	

}
