package com.example.demo;

//public class Song {
//}
import java.util.*;
import java.util.stream.Collectors;

class Song {
    private String name;
    private String singer;
    private Date addedDate;
    private int playCount;

    public Song(String name, String singer, Date addedDate) {
        this.name = name;
        this.singer = singer;
        this.addedDate = addedDate;
        this.playCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void incrementPlayCount() {
        this.playCount++;
    }

    @Override
    public String toString() {
        return "Song{name='" + name + '\'' + ", singer='" + singer + '\'' + ", playCount=" + playCount + '}';
    }
}