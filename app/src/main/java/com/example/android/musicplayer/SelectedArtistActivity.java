package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class SelectedArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        String artistName = getIntent().getExtras().getString("artistName");

        getSupportActionBar().setTitle(artistName);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> songs = getIntent().getParcelableArrayListExtra("songList");

        ArrayList<Song> filteredSongs = new ArrayList<Song>();

        for (Song currentSong : songs)
            if (currentSong.getArtist().equals(artistName))
                filteredSongs.add(currentSong);

        SongAdapter adapter = new SongAdapter(this, filteredSongs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
