package com.example.demo;

//public class MusicPlayerSystem {
//}
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class MusicPlayerSystem {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // Adding some songs
        musicPlayer.addSong("Raat Di gedi", "diljit");
        musicPlayer.addSong("Parshawan", "harnoor");
        musicPlayer.addSong("naina", "diljit");

        // Playing songs
        musicPlayer.playSong("raat di gedi", null); // Play by name
        musicPlayer.playSong(null, "diljit"); // Play by singer
        musicPlayer.playSong("parshawan", "harnoor"); // Play by both
//
        musicPlayer.createPlaylist("sample.csv");
        musicPlayer.exportPlaylist("sample", ExportFormat.CSV);
        musicPlayer.exportPlaylist("sample", ExportFormat.TSV);
//        // Display reports
//        musicPlayer.getTopSongsOfDay();
//        musicPlayer.getTopSongsBySinger("diljit");
//        musicPlayer.getTopSongsByDate(new Date());
//        musicPlayer.getArtistsByPlayCount(0);
    }
}






















