package javatest;

public class MovieManagement {
    public static void main(String[] args) {
        Movie romComMovie = new RomComMovie("abcd", "Jon", 2018, 7.0, 120, true);
        Movie thrillerMovie = new ThrillerMovie("xyz", "Joe", 1995, 8.6, 127, false);

        System.out.println("Displaying movie details using polymorphism:\n");

        Movie[] movies = {romComMovie, thrillerMovie};
        for (Movie movie : movies) {
            movie.displayMovieDetails();
            System.out.println();
        }
    }
}
