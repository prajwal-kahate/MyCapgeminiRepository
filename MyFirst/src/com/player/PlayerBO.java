package com.player;

public class PlayerBO {
	
	
	
	public void displayPlayerdetails(Player[] player) {
		for (int i = 0; i < player.length; i++) {
			System.out.println(player[i].getPlayerName()+" "+player[i].getskills()+" "+player[i].getCountry());
		}
		
	}
	
	
	
	public void displayPlayerByCountry(Player[] player, String country) {
		
		
		for (int i = 0; i < player.length; i++) {
			if (player[i].getCountry().toLowerCase().equals(country.toLowerCase())) {
				System.out.println(player[i].getPlayerName());
	
			} 
		}
	}
	

}
