package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> songs = getIntent().getParcelableArrayListExtra("songList");

        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("songList", songs);

        LinearLayout brunoMars = findViewById(R.id.brunoMars);
        brunoMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brunoMarsIntent = new Intent(ArtistsActivity.this, SelectedArtistActivity.class)
                        .putExtras(bundle)
                        .putExtra("artistName", "Bruno Mars");

                startActivity(brunoMarsIntent);
            }
        });

        LinearLayout eminem = findViewById(R.id.eminem);
        eminem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eminemIntent = new Intent(ArtistsActivity.this, SelectedArtistActivity.class)
                        .putExtras(bundle)
                        .putExtra("artistName", "Eminem");

                startActivity(eminemIntent);
            }
        });

        LinearLayout fallOutBoy = findViewById(R.id.fallOutBoy);
        fallOutBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fallOutBoyIntent = new Intent(ArtistsActivity.this, SelectedArtistActivity.class)
                        .putExtras(bundle)
                        .putExtra("artistName", "Fall Out Boy");

                startActivity(fallOutBoyIntent);
            }
        });

        LinearLayout kendrickLamar = findViewById(R.id.kendrickLamar);
        kendrickLamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kendrickLamarIntent = new Intent(ArtistsActivity.this, SelectedArtistActivity.class)
                        .putExtras(bundle)
                        .putExtra("artistName", "Kendrick Lamar");

                startActivity(kendrickLamarIntent);
            }
        });

        LinearLayout yearsYears = findViewById(R.id.yearsYears);
        yearsYears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yearsYearsIntent = new Intent(ArtistsActivity.this, SelectedArtistActivity.class)
                        .putExtras(bundle)
                        .putExtra("artistName", "Years & Years");

                startActivity(yearsYearsIntent);
            }
        });

    }
}
