package Registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import Data.Customer;
import Data.Music;


public class MusicRegistration {

		// TODO Auto-generated method stub
		private ArrayList<Music> musicR;

		public MusicRegistration() {
			musicR = new ArrayList<Music>();
		}

		public void addMusic(Music music) {
			musicR.add(music);
		}

		public Music getMusic(int index) {
			return musicR.get(index);
		}
		
		public void removeMusic(Music music) {
			musicR.remove(music);
		}
		public void removeMusic(int index) {
			musicR.remove(index);
		}

		public int size() {
			return musicR.size();
		}
		public void rentalMusic (Music music, Customer customer){
			LocalDateTime now = LocalDateTime.now();
			music.setRentalDate(now);
			music.setMusicToCustomer(customer);
		}
		public void listMusicAZ(){
			Collections.sort(musicR);
		}

	
	}


