package com.step.assignments.leaguetable;

public class FootballTeam  extends Team{
    private String name;
    private int points;
    private int matchesWon;
    private int matchesLost;
    private int matchesDraw;

    public FootballTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDraw = matchesDraw;
        this.points = calculatePoints();
    }

    private int calculatePoints(){
        return 1*matchesWon-2*matchesDraw;
    }

    public int getPoints() {
        return points;
    }

    public int compareTo(Team team){
        return this.points-team.getPoints() ;
    }
    public String getName() {
        return name;
    }
}
