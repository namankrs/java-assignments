package com.step.assignments.arraylists.playlist;

public class Song {
    private String title;
    private Double duration;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play(){
        System.out.printf("playing %s",this.title);
    }
}
