package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ties", "Years & Years", "Communion", "2015", "Pop", "3:47", R.drawable.yearsyears));
        songs.add(new Song("HUMBLE.", "Kendrick Lamar", "DAMN.", "2017", "Hip-Hop/Rap", "3:03", R.drawable.damn));
        songs.add(new Song("Immortals", "Fall Out Boy", "American Beauty/American Psycho", "2015", "Pop", "3:09", R.drawable.american));
        songs.add(new Song("'Till I Collapse", "Eminem", "The Eminem Show", "2002", "Hip-Hop/Rap", "4:59", R.drawable.eminem));
        songs.add(new Song("Liquor Store Blues", "Bruno Mars", "Doo-Wops & Hooligans", "2010", "Soul/R&B", "4:03", R.drawable.doo));
        songs.add(new Song("Ready For You", "Years & Years", "Communion", "2015", "Pop", "3:19", R.drawable.yearsyears));
        songs.add(new Song("DNA.", "Kendrick Lamar", "DAMN.", "2017", "Hip-Hop/Rap", "4:04", R.drawable.damn));
        songs.add(new Song("Centuries", "Fall Out Boy", "American Beauty/American Psycho", "2015", "Pop", "3:51", R.drawable.american));
        songs.add(new Song("Sing for the Moment", "Eminem", "The Eminem Show", "2002", "Hip-Hop/Rap", "5:27", R.drawable.eminem));
        songs.add(new Song("Just the Way You Are ", "Bruno Mars", "Doo-Wops & Hooligans", "2010", "Soul/R&B", "3:39", R.drawable.doo));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
