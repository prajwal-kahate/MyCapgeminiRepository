package com.player;

public class Test extends Player{

	public static void main(String[] args) {
		Player player1 = new Player("Virat","India","Batter");
		Player player2 = new Player("Rahul","India", "Wicket keeper");
		Player player3 = new Player("Smith","Australia","Batter");
		Player player4 = new Player("Rickey","Australia","Batter");
		Player[] allplayer = {player1,player2,player3,player4};
		
		PlayerBO playerbo = new PlayerBO();
		//playerbo.displayPlayerdetails(allplayer);
		
		//playerbo.displayPlayerByCountry(allplayer, "India");
		
		Player pl = new Player();
		
		player1.setPlayerName("prajwal");
		
		System.out.println(player1);
		
		
	}

}
