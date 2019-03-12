package com.step.assignments.leaguetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {
    private List<T> teams = new ArrayList<T>();

    public void addTeam(T team){
        teams.add(team);
    }

    public void sort(){
        teams.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {

                return o2.compareTo(o1);
            }
        });
    }

    public List<T> getTeams() {
        return teams;
    }
}
