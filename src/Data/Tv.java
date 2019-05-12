package Data;

import java.time.LocalDateTime;

public class Tv implements Comparable<Tv> {
	
	int year;
	private String  title, genre, director;
	private LocalDateTime rentalDate;
	private static int idTv=1;
	private int tvId;
	Customer tvToCustomer;

	public Tv(int year, String title, String genre, String director ) {
		super();
		this.year = year;
		this.title = title;
		this.genre = genre;
		this.director = director;
		rentalDate = null;
		tvToCustomer = null;
		this.tvId = idTv;
		idTv++;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
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

	public int getTvId() {
		return tvId;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getTvToCustomer() {
		return tvToCustomer.getName();
	}

	public void setTvToCustomer(Customer tvToCustomer) {
		this.tvToCustomer = tvToCustomer;
	}

	public int compareTo1(Tv tv) {

		// TODO Auto-generated method stub
		return this.title.compareToIgnoreCase(tv.getTitle());
	}

	@Override
	public int compareTo(Tv o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
