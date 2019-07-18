package com.example.et.musicalstructure;

import java.util.ArrayList;

/**
 * Created by 500052376 on 11/6/2018.
 */

public class Item {

    private String mArtist;
    private String mSong;
    private String mAlbum;
    String value;

    public Item(String value) {
        this.value = value;
        setval();
    }

    public void setval() {
        mAlbum = value;
        mArtist = value;
        mSong = value;


    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmSong() {
        return mSong;
    }

    public void setmSong(String mSong) {
        this.mSong = mSong;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(String mAlbum) {
        this.mAlbum = mAlbum;
    }
}


