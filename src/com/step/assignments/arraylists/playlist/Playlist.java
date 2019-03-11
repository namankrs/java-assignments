package com.step.assignments.arraylists.playlist;

import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
    }

    public void addAlbum(LinkedList album){
        this.songs.addAll(album);
    }
}
