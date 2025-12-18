package org.example;
public class Cinema {
    private String name;
    private Movie movie;

    public Cinema(String name, Movie movie) {
        this.name = name;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void show() {
        System.out.print("Now playing at " + name + ": ");
        movie.show();
    }
}