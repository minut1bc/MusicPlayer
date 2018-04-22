package com.example.android.musicplayer;

import android.widget.ImageView;

public class Song {

    private String mTitle;

    private String mArtist;

    private String mAlbum;

    private String mYear;

    private String mGenre;

    private String mTime;

    private int mAlbumArt;

    public Song(String Title, String Artist, String Album, String Year, String Genre, String Time, int AlbumArt) {
        mTitle = Title;
        mArtist = Artist;
        mAlbum = Album;
        mYear = Year;
        mGenre = Genre;
        mTime = Time;
        mAlbumArt = AlbumArt;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getYear() {
        return mYear;
    }

    public String getGenre() {
        return mGenre;
    }

    public String getTime() {
        return mTime;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }
}
