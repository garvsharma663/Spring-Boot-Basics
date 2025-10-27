package com.springboot.movieapp.model;

public class Movies {
    private String title;
    private int rating;

    public Movies(String title, int rating){
        this.rating = rating;
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
