package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import Data.Customer;
import Data.Tv;

public class TvRegistration {

	// TODO Auto-generated method stub
	private ArrayList<Tv> tvR;

	public TvRegistration() {
		tvR = new ArrayList<Tv>();
	}

	public void addTv(Tv tv) {
		tvR.add(tv);
	}

	public Tv getTv(int index) {
		return tvR.get(index);
	}

	public void removeTv(Tv tv) {
		tvR.remove(tv);
	}

	public void removeTv(int index) {
		tvR.remove(index);
	}

	public int size() {
		return tvR.size();
	}

	public void rentTv(Tv tv, Customer customer) {
		LocalDateTime now = LocalDateTime.now();
		tv.setRentalDate(now);
		tv.setTvToCustomer(customer);
	}

	public void listTvAZ() {
		Collections.sort(tvR);
	}

}
