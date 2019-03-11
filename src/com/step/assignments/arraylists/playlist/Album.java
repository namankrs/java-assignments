package com.step.assignments.arraylists.playlist;

import java.util.LinkedList;

public class Album {
    private LinkedList<Song> songs;

    public Album(LinkedList<Song> songs) {
        this.songs = songs;
    }

    public LinkedList getSongs(){
        return this.songs;
    }
}
