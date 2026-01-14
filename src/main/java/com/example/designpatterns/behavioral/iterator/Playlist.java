package com.example.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aggregate that exposes an iterator without exposing internal list.
 */
public class Playlist {
    private final List<Song> songs = new ArrayList<>();

    public void add(Song song) {
        songs.add(song);
    }

    public PlaylistIterator iterator() {
        return new ListPlaylistIterator(Collections.unmodifiableList(songs));
    }
}
