package com.example.kinopoisk;

public class KinoRecyclerView {

    private int image;
    private String title;
    private String description;
    private String storyline;

    public KinoRecyclerView(int image, String title, String description, String storyline) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.storyline = storyline;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStoryline() {
        return storyline;
    }
}
