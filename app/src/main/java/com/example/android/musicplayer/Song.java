package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    // Member variables

    private String mTitle;

    private String mArtist;

    private String mAlbum;

    private String mYear;

    private String mGenre;

    private String mTime;

    private int mAlbumArt;

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    Song(String title, String artist, String album, String year, String genre, String time, int albumArt) {
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
        mYear = year;
        mGenre = genre;
        mTime = time;
        mAlbumArt = albumArt;
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

    // In constructor you will read the variables from Parcel. Make sure to read them in the same sequence in which you have written them in Parcel.

    private Song(Parcel in) {
        mTitle = in.readString();
        mArtist = in.readString();
        mAlbum = in.readString();
        mYear = in.readString();
        mGenre = in.readString();
        mTime = in.readString();
        mAlbumArt = in.readInt();
    }

    // This is where you will write your member variables in Parcel. Here you can write in any order. It is not necessary to write all members in Parcel.

    public int describeContents() {
        return 0;
    }

    // This is to de-serialize the object

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //Write data in any order
        dest.writeString(mTitle);
        dest.writeString(mArtist);
        dest.writeString(mAlbum);
        dest.writeString(mYear);
        dest.writeString(mGenre);
        dest.writeString(mTime);
        dest.writeInt(mAlbumArt);
    }

}
