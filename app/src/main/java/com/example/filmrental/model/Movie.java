package com.example.filmrental.model;

import android.support.annotation.DrawableRes;

public class Movie {
    private int id;
    @DrawableRes
    private int thumbnail;
    private String date;
    private String title;

    public Movie() {
    }

    public Movie(int thumbnail, String date, String title) {
        this.thumbnail = thumbnail;
        this.date = date;
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
