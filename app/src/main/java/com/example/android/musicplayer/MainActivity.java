package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Ties", "Years & Years", "Communion", "2015", "Pop", "3:47", R.drawable.communion));
        songs.add(new Song("Immortals", "Fall Out Boy", "American Beauty/American Psycho", "2015", "Pop", "3:09", R.drawable.american));
        songs.add(new Song("'Till I Collapse", "Eminem", "The Eminem Show", "2002", "Hip-Hop/Rap", "4:59", R.drawable.eminem));
        songs.add(new Song("Liquor Store Blues", "Bruno Mars", "Doo-Wops & Hooligans", "2010", "Soul/R&B", "4:03", R.drawable.doo));
        songs.add(new Song("DNA.", "Kendrick Lamar", "DAMN.", "2017", "Hip-Hop/Rap", "4:04", R.drawable.damn));
        songs.add(new Song("Ready For You", "Years & Years", "Communion", "2015", "Pop", "3:19", R.drawable.communion));
        songs.add(new Song("Centuries", "Fall Out Boy", "American Beauty/American Psycho", "2015", "Pop", "3:51", R.drawable.american));
        songs.add(new Song("Sing for the Moment", "Eminem", "The Eminem Show", "2002", "Hip-Hop/Rap", "5:27", R.drawable.eminem));
        songs.add(new Song("Just the Way You Are ", "Bruno Mars", "Doo-Wops & Hooligans", "2010", "Soul/R&B", "3:39", R.drawable.doo));
        songs.add(new Song("HUMBLE.", "Kendrick Lamar", "DAMN.", "2017", "Hip-Hop/Rap", "3:03", R.drawable.damn));

        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("songList", songs);

        TextView songsTextView = findViewById(R.id.songs_text_view);
        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class)
                        .putExtras(bundle);

                startActivity(songsIntent);
            }
        });

        TextView artistsTextView = findViewById(R.id.artists_text_view);
        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class)
                        .putExtras(bundle);

                startActivity(artistsIntent);

            }
        });

        TextView albumsTextView = findViewById(R.id.albums_text_view);
        albumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class)
                        .putExtras(bundle);

                startActivity(albumsIntent);
            }
        });

    }
}
