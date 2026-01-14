package com.example.designpatterns.behavioral.iterator;

import java.util.List;

/**
 * Concrete iterator over a playlist snapshot.
 */
public class ListPlaylistIterator implements PlaylistIterator {
    private final List<Song> songs;
    private int index = 0;

    public ListPlaylistIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
