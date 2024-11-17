package javatest;

class RomComMovie extends Movie {
    private boolean hasHappyEnding;

    public RomComMovie(String title, String director, int releaseYear, double rating, double duration, boolean hasHappyEnding) {
        super(title, director, releaseYear, rating, duration);
        this.hasHappyEnding = hasHappyEnding;
    }

    public void displayMovieDetails() {
        System.out.println("Romantic Comedy Movie Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Rating: " + getRating());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Has Happy Ending: " + (hasHappyEnding ? "Yes" : "No"));
    }
}
