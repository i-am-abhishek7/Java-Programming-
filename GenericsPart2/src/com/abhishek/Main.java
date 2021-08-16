package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer Ronaldo = new FootballPlayer("Ronaldo");
	    BaseballPlayer pat = new BaseballPlayer("Pat");
	    SoccerPlayer Jon = new SoccerPlayer("Jon");

	    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
	    adelaideCrows.addPlayer(Ronaldo);
//	    adelaideCrows.addPlayer(pat);
//	    adelaideCrows.addPlayer(Jon);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("This won't work");
        soccerTeam.addPlayer(Jon);
    }
}
