package com.example.et.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Player extends AppCompatActivity {
    TextView title;
    TextView artist;
    TextView album;
    Button play;//they dont do anything right now as it is a layout otherwise they control audio
    Button pause;
    ArrayList<String> songtitle;
    ArrayList<String> artisttitle;
    ArrayList<String> albumtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        title = (TextView) findViewById(R.id.title);
        artist = (TextView) findViewById(R.id.artist);
        album = (TextView) findViewById(R.id.album);
        calc();
    }

    public void calc() {
        int p = getIntent().getIntExtra("Position", -1);//position
        songtitle = new ArrayList<String>();
        albumtitle = new ArrayList<>();
        artisttitle = new ArrayList<String>();
        MusicInfo obj = new MusicInfo();
        songtitle = obj.songsInfo();
        artisttitle = obj.artistInfo();
        albumtitle = obj.albumInfo();
        title.setText(songtitle.get(p));
        artist.setText(artisttitle.get(p));
        album.setText(albumtitle.get(p));
    }

}
