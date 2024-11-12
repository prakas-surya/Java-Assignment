package assignment;

public class MovieManagement {

	public static void main(String[] args) {
		
		MovieDTO movie = new MovieDTO("Inception", "Christopher Nolan", "Science Fiction", 2010, 8.8, 148);
		
		// use getters to get details
		System.out.println("Movie details fetched using getters :");
		System.out.println("Title : " + movie.getTitle());
		System.out.println("Director : " + movie.getDirector());
		System.out.println("Genre : " + movie.getGenre());
		System.out.println("Year Released : " + movie.getReleaseYear());
		System.out.println("Rating : " + movie.getRating());
		System.out.println("Duration : " + movie.getDuration() + " minutes");
		System.out.println("No of Movies : " + movie.getTotalMovies());
		
		// modify values using setters
		movie.setTitle("WWE");
		movie.setDirector("John Cena");
		movie.setGenre("Love");
		movie.setReleaseYear(2011);
		movie.setRating(7.5);
		movie.setDuration(110);
		
		System.out.println();
		// display movie details using displayMovieDetails method
		movie.displayMovieDetails();
		System.out.println("No of Movies : " + movie.getTotalMovies());
		
	}
}
