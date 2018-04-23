package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getTitle());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtist());

        TextView timeTextView = listItemView.findViewById(R.id.time_text_view);
        timeTextView.setText(currentSong.getTime());

        ImageView albumArtImageView = listItemView.findViewById(R.id.album_art_image_view);
        albumArtImageView.setImageResource(currentSong.getAlbumArt());

        return listItemView;
    }
}
