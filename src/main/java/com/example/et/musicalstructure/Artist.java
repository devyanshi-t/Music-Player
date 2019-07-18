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

public class Artist extends AppCompatActivity {
    private ListView listView;
    private adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
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
        listView = (ListView) findViewById(R.id.artist);
        ArrayList<Item> artistList = new ArrayList<>();
        artistList.add(new Item("Coldplay"));
        artistList.add(new Item("Berlin"));
        artistList.add(new Item("Linkin Park"));
        artistList.add(new Item("21 Pilots"));
        artistList.add(new Item("Nirvana"));
        artistList.add(new Item("Queen"));
        artistList.add(new Item("London Grammar"));
        artistList.add(new Item("The Cure"));
        artistList.add(new Item("Led Zepplin"));
        artistList.add(new Item("Elvis Preseley"));
        artistList.add(new Item("1975"));
        artistList.add(new Item("The Neighbourhood"));
        artistList.add(new Item("Artic Monkeys"));
        artistList.add(new Item("Imagine Dragons"));
        artistList.add(new Item("Adele"));
        mAdapter = new adapter(this, artistList);
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
