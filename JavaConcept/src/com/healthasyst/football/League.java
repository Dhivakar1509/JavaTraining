package com.healthasyst.football;

public class League {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		player1.PlayerName="Raina";
		
		Player player2 = new Player();
		player2.PlayerName="John";
		
		Player player3 = new Player();
		player3.PlayerName="Dhoni";
		
		Player[] players = new Player[3];
		players[0]=player1;
		players[1]=player2;
		players[2]=player3;
		
		Team team1= new Team();
		team1.TeamName="CSK";
		team1.playerArray=players;
		
		

	}

}
