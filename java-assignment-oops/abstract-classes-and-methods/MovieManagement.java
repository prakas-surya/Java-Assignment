package dynamic;

abstract class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public abstract String getGenre();
    
    public abstract String getMovieDescription();

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Genre: " + getGenre());
        System.out.println("Description: " + getMovieDescription());
    }
}

class RomComMovie extends Movie {
    private boolean hasIconicPair;

    public RomComMovie(String title, String director, int releaseYear, boolean hasIconicPair) {
        super(title, director, releaseYear);
        this.hasIconicPair = hasIconicPair;
    }

    public String getGenre() {
        return "Romantic Comedy";
    }

    public String getMovieDescription() {
        return hasIconicPair ? "A heartwarming rom-com with an unforgettable on-screen couple." : "A delightful romantic comedy with a charming storyline.";
    }
}

class ThrillerMovie extends Movie {
    private boolean isPsychological;

    public ThrillerMovie(String title, String director, int releaseYear, boolean isPsychological) {
        super(title, director, releaseYear);
        this.isPsychological = isPsychological;
    }

    public String getGenre() {
        return "Thriller";
    }

    public String getMovieDescription() {
        return isPsychological ? "A gripping psychological thriller with intense twists." : "An edge-of-your-seat thriller with suspenseful moments.";
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        Movie romComMovie = new RomComMovie("abc", "Jon", 2018, true);
        Movie thrillerMovie = new ThrillerMovie("xyz", "Joe", 2014, true);

        System.out.println("Movie Details:\n");
        romComMovie.displayMovieDetails();
        System.out.println();
        thrillerMovie.displayMovieDetails();
    }
}
