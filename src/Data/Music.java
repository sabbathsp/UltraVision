package Data;

import java.time.LocalDateTime;

public class Music implements Comparable<Music> {

	int year;
	private String title, media, band;
	private LocalDateTime rentalDate;
	private static int idMs = 1;
	private int idMusic;
	Customer musicToCustomer;

	public Music(int year, String title, String media, String band) {
		super();
		this.year = year;
		this.title = title;
		this.media = media;
		this.band = band;
		rentalDate = null;
		musicToCustomer = null;
		this.idMusic = idMs;
		idMs++;
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

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public int getIdMusic() {
		return idMusic;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getMusicToCustomer() {
		return musicToCustomer.getName();
	}

	public void setMusicToCustomer(Customer musicToCustomer) {
		this.musicToCustomer = musicToCustomer;
	}

	public int compareTo(Music music) {
		// TODO Auto-generated method stub
		return this.title.compareToIgnoreCase(music.getTitle());
	}

}
