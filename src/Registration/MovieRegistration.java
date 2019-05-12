package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import Data.Customer;
import Data.Movie;

public class MovieRegistration {

	// TODO Auto-generated method stub
		private ArrayList<Movie> movieR;


		public MovieRegistration() {
		movieR = new ArrayList<Movie>();
		}

	public void addMovie(Movie movie) {
		movieR.add(movie);
	}

	public Movie getMovie(int index) {
		return movieR.get(index);
	}

	public void removeMovie(Movie movie) {
		movieR.remove(movie);
	}

	public void removeMovie(int index) {
		movieR.remove(index);
	}

	public int size() {
		return movieR.size();
	}

	public void rentMovie(Movie movie, Customer customer) {
		LocalDateTime now = LocalDateTime.now();
		movie.setRentalDate(now);
		movie.setMovieToCustomer(customer);
	}

	public void listMovieAZ(){
		Collections.sort(movieR);
	}

	

}
