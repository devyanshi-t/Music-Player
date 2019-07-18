package com.example.et.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    private ListView listView;
    private adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //goto main menu
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //goto playlist
                Intent i = new Intent(getApplicationContext(), Playlist.class);
                startActivity(i);
            }
        });
        calc();
    }

    public void calc() {
        listView = (ListView) findViewById(R.id.songs);
        ArrayList<Item> songList = new ArrayList<>();
        songList.add(new Item("A Sky full of stars"));
        songList.add(new Item("Take my breath away"));
        songList.add(new Item("Numb"));
        songList.add(new Item("Jumpsuit"));
        songList.add(new Item("Smells like teen spirit"));
        songList.add(new Item("Bohemian Rhapsody"));
        songList.add(new Item("Stay Awake"));
        songList.add(new Item("Pictures of you"));
        songList.add(new Item("Immigrant song"));
        songList.add(new Item("Can't help falling in love"));
        songList.add(new Item("Robbers"));
        songList.add(new Item("Sweater Weather"));
        songList.add(new Item("Do I wanna Know"));
        songList.add(new Item("Thunder"));
        songList.add(new Item("Rolling in the Deep"));
        mAdapter = new adapter(this, songList);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked goto music player
                Intent i = new Intent(getApplicationContext(), Player.class);
                ;
                i.putExtra("Position", position);
                startActivity(i);
            }
        });

    }

}
