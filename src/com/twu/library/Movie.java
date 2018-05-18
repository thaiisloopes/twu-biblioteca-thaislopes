package com.twu.library;

public class Movie extends Item {
    private Integer movieRating;
    private String director;


    public Movie(Integer id, Integer yearPublished, String name, Integer movieRating, String director) {
        super(id, yearPublished, name);
        this.movieRating = movieRating;
        this.director = director;
        this.type = Type.MOVIE;
    }

    public String toString() {
        return this.id + " - " + this.name + ", " + this.yearPublished + ", " + this.director + ", " + this.movieRating + " - (" + this.type + ")";
    }
}
