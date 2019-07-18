package com.example.et.musicalstructure;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by devyanshi on 11/5/2018.
 */
//custom class for all info about the music

public class MusicInfo {

    ArrayList<String> song;
    ArrayList<String> artist;
    ArrayList<String> album;

    public ArrayList<String> songsInfo() {
        song = new ArrayList<String>();
        song.add("A Sky full of stars");
        song.add("Take my breath away");
        song.add("Numb");
        song.add("Jumpsuit");
        song.add("Smells like teen spirit");
        song.add("Bohemian Rhapsody");
        song.add("Stay Awake");
        song.add("Pictures of you");
        song.add("Immigrant song");
        song.add("Cant help falling in love");
        song.add("Robbers");
        song.add("Sweater Weather");
        song.add("Do I wanna Know");
        song.add("Thunder");
        song.add("Rolling in the deep");
        return song;
    }

    public ArrayList<String> artistInfo() {
        artist = new ArrayList<String>();
        artist.add("Coldplay");
        artist.add("Berlin");
        artist.add("Linkin Park");
        artist.add("21 Pilots");
        artist.add("Nirvana");
        artist.add("Queen");
        artist.add("London Grammar");
        artist.add("The Cure");
        artist.add("Led Zepplin");
        artist.add("Elvis Preseley");
        artist.add("1975");
        artist.add("The Neighbourhood");
        artist.add("Artic Monkeys");
        artist.add("Imagine Dragons");
        artist.add("Adele");
        return artist;
    }

    public ArrayList<String> albumInfo() {
        album = new ArrayList<String>();
        album.add("Ghost Stories");
        album.add("Top Gun");
        album.add("Meteora");
        album.add("Trench");
        album.add("Nevermind");
        album.add("A night at the opera");
        album.add("If you wait");
        album.add("Disintegration");
        album.add("Led Zepplin III");
        album.add("Blue Hawaii");
        album.add("The 1975");
        album.add("I Love You");
        album.add("AM");
        album.add("Evolve");
        album.add("21");
        return album;
    }
}
