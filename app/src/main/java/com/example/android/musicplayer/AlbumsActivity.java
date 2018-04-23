package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> songs = getIntent().getParcelableArrayListExtra("songList");

        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("songList", songs);

        LinearLayout american = findViewById(R.id.american);
        american.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent americanIntent = new Intent(AlbumsActivity.this, SelectedAlbumActivity.class)
                        .putExtras(bundle)
                        .putExtra("albumName", "American Beauty/American Psycho");

                startActivity(americanIntent);
            }
        });

        LinearLayout communion = findViewById(R.id.communion);
        communion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent communionIntent = new Intent(AlbumsActivity.this, SelectedAlbumActivity.class)
                        .putExtras(bundle)
                        .putExtra("albumName", "Communion");

                startActivity(communionIntent);
            }
        });

        LinearLayout damn = findViewById(R.id.damn);
        damn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent damnIntent = new Intent(AlbumsActivity.this, SelectedAlbumActivity.class)
                        .putExtras(bundle)
                        .putExtra("albumName", "DAMN.");

                startActivity(damnIntent);
            }
        });

        LinearLayout doo = findViewById(R.id.doo);
        doo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dooIntent = new Intent(AlbumsActivity.this, SelectedAlbumActivity.class)
                        .putExtras(bundle)
                        .putExtra("albumName", "Doo-Wops & Hooligans");

                startActivity(dooIntent);
            }
        });

        LinearLayout eminemShow = findViewById(R.id.eminemShow);
        eminemShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eminemShowIntent = new Intent(AlbumsActivity.this, SelectedAlbumActivity.class)
                        .putExtras(bundle)
                        .putExtra("albumName", "The Eminem Show");

                startActivity(eminemShowIntent);
            }
        });

    }
}
