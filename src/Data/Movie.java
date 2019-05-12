package Data;


import java.time.LocalDateTime;

public class Movie implements Comparable<Movie> {

	
	private String year, title, genre, director;
	private LocalDateTime rentalDate;
	private static int idMv=1;
	private int idMovie;
	Customer movieToCustomer;

	public Movie(String year, String title, String genre, String director) {
		super();
		this.year = year;
		this.title = title;
		this.genre = genre;
		this.director = director;
		rentalDate = null;
		movieToCustomer = null;
		this.idMovie = idMv;
		idMv++;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getMovieId() {
		return idMovie;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getMovieToCustomer() {
		return movieToCustomer.getName();
	}

	public void setMovieToCustomer(Customer movieToCustomer) {
		this.movieToCustomer = movieToCustomer;
	}

	public int compareTo(Movie m) {

		// TODO Auto-generated method stub
		return this.title.compareToIgnoreCase(m.getTitle());
	}

}
