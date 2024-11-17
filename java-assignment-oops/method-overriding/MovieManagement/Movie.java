package javatest;

abstract class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private double duration;

    public Movie(String title, String director, int releaseYear, double rating, double duration) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
    }

    public abstract void displayMovieDetails();

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public double getDuration() {
        return duration;
    }
}
