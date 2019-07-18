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

import java.util.ArrayList;

public class Album extends AppCompatActivity {
    private ListView listView;
    private adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
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
        calc();

    }

    public void calc() {
        listView = (ListView) findViewById(R.id.albumlist);
        ArrayList<Item> albumList = new ArrayList<>();
        albumList.add(new Item("Ghost Stories"));
        albumList.add(new Item("Top Gun"));
        albumList.add(new Item("Meteora"));
        albumList.add(new Item("Trench"));
        albumList.add(new Item("Nevermind"));
        albumList.add(new Item("A night at the opera"));
        albumList.add(new Item("If you wait"));
        albumList.add(new Item("Disintegration"));
        albumList.add(new Item("Led Zepplin III"));
        albumList.add(new Item("Blue Hawaii"));
        albumList.add(new Item("The 1975"));
        albumList.add(new Item("I Love You"));
        albumList.add(new Item("AM"));
        albumList.add(new Item("Evolve"));
        albumList.add(new Item("21"));
        mAdapter = new adapter(this, albumList);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked goto songs
                Intent i = new Intent(getApplicationContext(), Songs.class);
                i.putExtra("Position", position);
                startActivity(i);

            }
        });
    }

}
