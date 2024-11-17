package javatest;

class ThrillerMovie extends Movie {
    private boolean isBasedOnTrueStory;

    public ThrillerMovie(String title, String director, int releaseYear, double rating, double duration, boolean isBasedOnTrueStory) {
        super(title, director, releaseYear, rating, duration);
        this.isBasedOnTrueStory = isBasedOnTrueStory;
    }

    public void displayMovieDetails() {
        System.out.println("Thriller Movie Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Rating: " + getRating());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Based on True Story: " + (isBasedOnTrueStory ? "Yes" : "No"));
    }
}
