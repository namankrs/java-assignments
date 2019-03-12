package com.step.assignments.leaguetable;

public class Main {


    public static void main(String[] args) {

        CricketTeam team1 = new CricketTeam("A", 2, 0, 0);
        CricketTeam team2 = new CricketTeam("B", 3, 0, 0);
        FootballTeam team3 = new FootballTeam("C", 4, 0, 0);
        FootballTeam team4 = new FootballTeam("D", 5, 0, 0);

        LeagueTable<CricketTeam> cricketLeague = new LeagueTable<>();
        LeagueTable<FootballTeam> footballLeague = new LeagueTable<>();

        cricketLeague.addTeam(team1);
        cricketLeague.addTeam(team2);

        footballLeague.addTeam(team3);
        footballLeague.addTeam(team4);

        cricketLeague.sort();
        footballLeague.sort();

        cricketLeague.getTeams().forEach(team-> System.out.println( team.getName()));
        footballLeague.getTeams().forEach(team-> System.out.println( team.getName()));


    }

}
