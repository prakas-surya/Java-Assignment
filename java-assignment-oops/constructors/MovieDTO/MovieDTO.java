package assignment;

public class MovieDTO {

	// assuming movies list should be 100 - due to array
	private static MovieDTO[] movies = new MovieDTO[100];
    private static int totalMovies = 0;
    
    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private double rating;
    private double duration;

    public MovieDTO(String title, String director, String genre, int releaseYear, double rating, double duration) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        
        addMovie(this);
        
    }
    
    private static void addMovie(MovieDTO movie) {
    	if (totalMovies < movies.length) {
    		movies[totalMovies++] = movie;
    	} else {
    		System.out.println("Movie List is Full, cannot add more Movies!");
    	}
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " minutes");
    }
    
    public static void displayAllMovies() {
    	System.out.println("Movies collections are : ");
    	for (int i=0; i<totalMovies; i++) {
    		System.out.println("Movie_" + (i+1) + " :");
    		movies[i].displayMovieDetails();
    		System.out.println();
    	}
    	System.out.println("Total Movies : " + totalMovies);
   }
}

