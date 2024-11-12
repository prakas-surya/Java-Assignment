package assignment;

public class MovieManagement {

	public static void main(String[] args) {
		
		MovieDTO movie1 = new MovieDTO("Inception", "Christopher Nolan", "Science Fiction", 2010, 8.8, 148);
		new MovieDTO("Dark", "Hanks", "Science Fiction", 2010, 6.4, 140);
		new MovieDTO("Light", "Henry", "War", 2010, 8.9, 190);
		new MovieDTO("Room", "Christopher", "Drama", 2010, 9.8, 167);
		
		// use getters to get details
		System.out.println("Movie details fetched using getters :");
		System.out.println("Title : " + movie1.getTitle());
		System.out.println("Director : " + movie1.getDirector());
		System.out.println("Genre : " + movie1.getGenre());
		System.out.println("Year Released : " + movie1.getReleaseYear());
		System.out.println("Rating : " + movie1.getRating());
		System.out.println("Duration : " + movie1.getDuration() + " minutes");
		System.out.println("No of Movies : " + MovieDTO.getTotalMovies());
		
		// modify values using setters
		movie1.setTitle("WWE");
		movie1.setDirector("John Cena");
		movie1.setGenre("Love");
		movie1.setReleaseYear(2011);
		movie1.setRating(7.5);
		movie1.setDuration(110);
		
		System.out.println();
		// display movie details using displayMovieDetails method
		System.out.println("Display movie details using displayMovieDetails method after modifying movie with setters:");
		movie1.displayMovieDetails();
		System.out.println("No of Movies : " + MovieDTO.getTotalMovies());
		
		// display all movies
		System.out.println();
		MovieDTO.displayAllMovies();
		
	}
}
