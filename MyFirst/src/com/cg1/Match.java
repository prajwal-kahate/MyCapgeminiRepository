package com.cg1;

public class Match 
{
	private String Country;
	private String Captain;
	private int Matches;
	
	public Match(String country, String captain, int matches) {
		Country = country;
		Captain = captain;
		Matches = matches;
	}
	
	

	public String getCountry() {
		return Country;
	}



	public void setCountry(String country) {
		Country = country;
	}



	public String getCaptain() {
		return Captain;
	}



	public void setCaptain(String captain) {
		Captain = captain;
	}



	public int getMatches() {
		return Matches;
	}



	public void setMatches(int matches) {
		Matches = matches;
	}
	
	
	


	@Override
	public String toString() {
		return "Country Name =" + Country + " \nCaptain Name=" + Captain + " \nNumber of Matches=" + Matches ;
	}
	
	
	
	
}
