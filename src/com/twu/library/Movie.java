package com.twu.library;

public class Movie {
    private Integer id, year, movieRating;
    private String name, director;

    public Movie(Integer id, String name, Integer year, String director, Integer movieRating) {
        this.id = id;
        this.name= name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public String toString() {
        return this.id + " - " + this.name + ", " + this.year + ", " + this.director + ", " + this.movieRating;
    }
}
