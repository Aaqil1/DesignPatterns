package com.example.designpatterns.behavioral.iterator;

/**
 * Problem: Product team wants consistent iteration over playlists (UI, API,
 * exports) without exposing collection internals.
 *
 * Iterator provides a common traversal contract.
 */
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new Song("Ocean", "Sam"));
        playlist.add(new Song("Mountains", "Ava"));

        PlaylistIterator iterator = playlist.iterator();
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}
