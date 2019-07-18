package com.example.et.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button songs;
    Button artist;
    Button playlists;
    Button album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc();
    }

    public void calc() {
        songs = (Button) findViewById(R.id.songs);
        artist = (Button) findViewById(R.id.artist);
        playlists = (Button) findViewById(R.id.playlist);
        album = (Button) findViewById(R.id.album);

        songs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                Intent i = new Intent(getApplicationContext(), Songs.class);
                startActivity(i);
            }
        });
        artist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                Intent i = new Intent(getApplicationContext(), Artist.class);
                startActivity(i);
            }
        });
        playlists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                Intent i = new Intent(getApplicationContext(), Playlist.class);
                startActivity(i);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                Intent i = new Intent(getApplicationContext(), Album.class);
                startActivity(i);
            }
        });


    }
}
