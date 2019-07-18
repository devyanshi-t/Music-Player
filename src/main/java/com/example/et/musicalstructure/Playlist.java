package com.example.et.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {
    ListView playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        playlist = (ListView) findViewById(R.id.artist);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        calc();
    }

    public void calc() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Playlist 1");
        al.add("Rock Collection");
        al.add("Pop Collection");
        al.add("Indie Collection");
        al.add("Fav Collection");
        al.add("All Collection");
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al);
        playlist.setAdapter(aa);
        playlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked goto songs
                Intent i = new Intent(getApplicationContext(), Songs.class);
                startActivity(i);
            }
        });

    }


}
