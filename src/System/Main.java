package System;

import java.util.Scanner;

import Data.Customer;
import Data.Movie;
import Data.Music;
import Data.Tv;
import Registration.CustomerReg;
import Registration.MovieRegistration;
import Registration.MusicRegistration;
import Registration.TvRegistration;

public abstract class Main {

	private static Scanner sc = new Scanner(System.in);
	private static MovieRegistration movieR;
	private static MusicRegistration musicR;
	private static CustomerReg cR;
	private static TvRegistration tvR;

	// add customer
	private static void addCustomer() {

		String name, phone, member;
		Customer c;
		System.out.println("===> Add new customer: \n");
		System.out.print(" Name: ");
		name = sc.nextLine();
		System.out.print(" Phone: ");
		phone = sc.nextLine();
		System.out.print(" Member type?    \n");
		System.out.print("    Musiclover   \n");
		System.out.print("    Videolover   \n");
		System.out.print("    TvLover      \n");
		System.out.print("    Premium      \n");
		System.out.print(" Type a Category: ");
		member = sc.nextLine();

		c = new Customer(name, phone, member);
		cR.addCustomer(c);
	}

	// add movie
	private static void addMovie() {
		// TODO Auto-generated method stub
		String year, title, genre, director;
		Movie m;
		System.out.println("\n==> Add Movie: ");
		System.out.print(" Title: ");
		title = sc.nextLine();
		System.out.print(" Genre: ");
		genre = sc.nextLine();
		System.out.print(" Diretor: ");
		director = sc.nextLine();
		System.out.print(" Year: ");
		year = sc.nextLine();
		m = new Movie(year, title, genre, director);
		movieR.addMovie(m);

	}

	// add music
	private static void addMusic() {
		// TODO Auto-generated method stub

		String title, band, media;
		int year;
		Music music;
		System.out.println("\n==> Add Music: ");
		System.out.print(" Title: ");
		title = sc.nextLine();
		System.out.print(" Band: ");
		band = sc.nextLine();
		System.out.print(" Media:  ");
		media = sc.nextLine();
		System.out.print(" Year: ");
		year = sc.nextInt();
		music = new Music(year, title, band, media);
		musicR.addMusic(music);

	}

	// add tvBox
	private static void addTv() {
		// TODO Auto-generated method stub
		int year;
		String title, genre, director;
		Tv tv;
		System.out.println("\n==> Add Tv Serie: ");
		System.out.print(" Title: ");
		title = sc.nextLine();
		System.out.print(" Genre: ");
		genre = sc.nextLine();
		System.out.print(" Diretor: ");
		director = sc.nextLine();
		System.out.print(" Year: ");
		year = sc.nextInt();
		tv = new Tv(year, title, genre, director);
		tvR.addTv(tv);
	}

	// available movie
	private static void moviesAvailable() {
		// TODO Auto-generated method stub
		System.out.println("================= Movies Available =============>>>");
		System.out.println("Id\tTitle\t\tGenre\t\tDirector\tYear\tSituation\t");
		for (int i = 0; i < movieR.size(); i++) {
			Movie m = movieR.getMovie(i);
			if (m.getRentalDate() == null) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\tAvailable\n", m.getMovieId(), m.getTitle(), m.getGenre(),
						m.getDirector(), m.getYear());

			}
		}
	}

	// available music
	private static void musicAvailable() {
		System.out.println("\n================= Music Available =============>>>");
		System.out.println("Id\tTitle\t\tBand\t\tMedia\t\tSituation");
		for (int i = 0; i < musicR.size(); i++) {
			Music music = musicR.getMusic(i);
			if (music.getRentalDate() == null) {
				System.out.printf("%s\t%s\t%s\t%s\t\tAvailable\n", music.getIdMusic(), music.getTitle(),
						music.getBand(), music.getMedia());
			}
		}
	}

	private static void tvAvailable() {
		// TODO Auto-generated method stub
		System.out.println("================= Tv Series Available =============>>>");
		System.out.println("Id\tTitle\t\tGenre\t\tDirector\tYear\tSituation\t");
		for (int i = 0; i < movieR.size(); i++) {
			Tv tv = tvR.getTv(i);
			if (tv.getRentalDate() == null) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\tAvailable\n", tv.getTvId(), tv.getTitle(), tv.getGenre(),
						tv.getDirector(), tv.getYear());

			}
		}
	}

	// all customers
	private static void allCustomers() {
		// TODO Auto-generated method stub
		System.out.println("\n=== Customers List =======================>>>");
		System.out.println("| Id\tName\t                Phone\t                Member |");
		for (int i = 0; i < cR.size(); i++) {
			Customer c = cR.getCustomer(i);
			System.out.printf("| %s\tName: %s\tPhone: %s\tMember: %s |\n", c.getIdCustomer(), c.getName(), c.getPhone(),
					c.getMember());
		}
	}

	// all movie
	private static void allMovies() {
		System.out.println("\n================= Movies =============>>>");
		System.out.println("Id\tYear\tTitle\t\tGenre\t\tDirector\tSituation\t\t Customer");
		for (int i = 0; i < movieR.size(); i++) {
			Movie m = movieR.getMovie(i);
			if (m.getRentalDate() == null) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\tAvailable\n", m.getMovieId(), m.getYear(), m.getTitle(),
						m.getGenre(), m.getDirector());
			} else {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t\t\t%s\t%s\n", m.getMovieId(), m.getYear(), m.getTitle(),
						m.getGenre(), m.getDirector(), m.getMovieToCustomer());

			}
		}
	}

	// all music
	private static void allMusic() {
		// TODO Auto-generated method stub

		System.out.println("\n================= Music / Live Concert =============>>>");
		System.out.println("Id\t Year\t Title\t\t\t Media\t\t Situation\t\t Customer");
		for (int i = 0; i < musicR.size(); i++) {
			Music music = musicR.getMusic(i);
			if (music.getRentalDate() == null) {
				System.out.printf("%s\t %s\t %s\t\t %s\t\t Available\n", music.getIdMusic(), music.getYear(),
						music.getTitle(), music.getMedia(), music.getBand());
			} else {
				System.out.printf("%s\t %s\t\t %s\t\t\t %s\t\t %s\n", music.getIdMusic(), music.getYear(),
						music.getTitle(), music.getMedia(), music.getBand(), music.getMusicToCustomer());

			}
		}
	}

	private static void allTv() {
		System.out.println("\n================= Tv Series =============>>>");
		System.out.println("Id\tYear\tTitle\t\tGenre\t\tDirector\tSituation\t\t Customer");
		for (int i = 0; i < tvR.size(); i++) {
			Tv tv = tvR.getTv(i);
			if (tv.getRentalDate() == null) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\tAvailable\n", tv.getTvId(), tv.getYear(), tv.getTitle(),
						tv.getGenre(), tv.getDirector());
			} else {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t\t\t%s\t%s\n", tv.getTvId(), tv.getYear(), tv.getTitle(),
						tv.getGenre(), tv.getDirector(), tv.getTvToCustomer());

			}
		}
	}

	// rent movie
	private static void rentMovie() {
		boolean flag = false;
		boolean flagCustomer = false;
		int idMv;
		int idCustomer;
		System.out.print("\n Option:");
		idMv = sc.nextInt();
		sc.nextLine();
		Main.allCustomers();
		System.out.println();
		System.out.print("\n Option:");
		idCustomer = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cR.size(); i++) {
			Customer c = cR.getCustomer(i);
			if (c.getIdCustomer() == idCustomer) {
				flagCustomer = true;
				for (int i1 = 0; i1 < movieR.size(); i1++) {
					Movie m = movieR.getMovie(i1);
					if (m.getMovieId() == idMv && m.getRentalDate() == null) {
						movieR.rentMovie(m, c);
						System.out.println("The movie " + m.getTitle() + "\nID" + m.getMovieId()
								+ " was suscessfull rented to: " + c.getName() + ".");
						System.out.println("Rental date: " + m.getRentalDate());
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("Movie unavailable.");
				}
			}
		}
		if (flagCustomer == false) {
			System.out.println("Can not find this customer.");
		}
	}

	// rent music
	private static void rentMusic() {
		// TODO Auto-generated method stub
		boolean flag = false;
		boolean flagCustomer = false;
		int idMusic;
		int idCustomer;
		System.out.print("\n Option: ");
		idMusic = sc.nextInt();
		sc.nextLine();
		Main.allCustomers();
		System.out.println();
		System.out.print("\n Option: ");
		idCustomer = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cR.size(); i++) {
			Customer customer = cR.getCustomer(i);
			if (customer.getIdCustomer() == idCustomer) {
				flagCustomer = true;
				for (int i1 = 0; i1 < musicR.size(); i1++) {
					Music music = musicR.getMusic(i1);
					if (music.getIdMusic() == idMusic && music.getRentalDate() == null) {
						musicR.rentalMusic(music, customer);
						System.out.println("Music" + music.getTitle() + music.getIdMusic()
								+ " was suscessfull rented to " + customer.getName() + ".");
						System.out.println("Rental date: " + music.getRentalDate());
						flag = true;
						Main.main(null);
					}
				}
				if (flag == false) {
					System.out.println("Music unavailable");
				}
			}
		}
		if (flagCustomer == false) {
			System.out.println("Can not find this customer.");
		}

	}

	// rent tvbox
	private static void rentTv() {
		// TODO Auto-generated method stub
		boolean flag = false;
		boolean flagCustomer = false;
		int idTv;
		int idCustomer;
		System.out.print("\n Option:");
		idTv = sc.nextInt();
		sc.nextLine();
		Main.allCustomers();
		System.out.println();
		System.out.print("\n Option:");
		idCustomer = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cR.size(); i++) {
			Customer c = cR.getCustomer(i);
			if (c.getIdCustomer() == idCustomer) {
				flagCustomer = true;
				for (int i1 = 0; i1 < movieR.size(); i1++) {
					Tv tv = tvR.getTv(i1);
					if (tv.getTvId() == idTv && tv.getRentalDate() == null) {
						tvR.rentTv(tv, c);
						System.out.println("The Tv Serie " + tv.getTitle() + "\nID" + tv.getTvId()
								+ " was suscessfull rented to: " + c.getName() + ".");
						System.out.println("Rental date: " + tv.getRentalDate());
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("Tv Serie unavailable.");
				}
			}
		}
		if (flagCustomer == false) {
			System.out.println("Can not find this customer.");
		}
	}

	// return movie
	private static void returnMovie() {
		// TODO Auto-generated method stub
		boolean flag = false;
		int idMv;
		System.out.print("Type id Movie to return:");
		idMv = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < movieR.size(); i++) {
			Movie m = movieR.getMovie(i);
			if (m.getMovieId() == idMv) {
				m.setRentalDate(null);
				flag = true;
				System.out.println("Movie id " + m.getMovieId() + " Was successfull returned.");
			}
		}
		if (flag == false) {
			System.out.println("coundnt find.");

		}
	}

	// return music
	private static void returnMusic() {
		boolean flag = false;
		int id;
		System.out.print("Type an id Music to return:");
		id = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < musicR.size(); i++) {
			Music music = musicR.getMusic(i);
			if (music.getIdMusic() == id) {
				music.setRentalDate(null);
				flag = true;
				System.out.println("Music " + music.getTitle() + music.getIdMusic() + " Was successfull returned.");
			}
		}
		if (flag == false) {
			System.out.println("coundnt find.");
		}
	}

	private static void returnTv() {
		// TODO Auto-generated method stub
		boolean flag = false;
		int idTv;
		System.out.print("Type the id Tv Serie to return:");
		idTv = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < tvR.size(); i++) {
			Tv tv = tvR.getTv(i);
			if (tv.getTvId() == idTv) {
				tv.setRentalDate(null);
				flag = true;
				System.out.println("Tv Serie id: " + tv.getTvId() + " Was successfull returned.");
			}
		}
		if (flag == false) {
			System.out.println("coundnt find.");

		}
	}

	// sort movies
	private static void listMovieAZ() {
		movieR.listMovieAZ();
	}

	// sort music
	private static void listMusicAZ() {
		musicR.listMusicAZ();
	}

	private static void listTvAZ() {
		tvR.listTvAZ();
	}

	private static void welcomeMessage() {
		System.out.println("==== Welcome to Ultra Vision! ==>>");
	}

	public static void main(String[] args) {

		tvR = new TvRegistration();
		musicR = new MusicRegistration();
		movieR = new MovieRegistration();
		cR = new CustomerReg();

		// tv list
		Tv tv1 = new Tv(2011, "Game of Thrones", "Action", "David Benioff");
		Tv tv2 = new Tv(2008, "Breaking Bad", "Crime", "Vince Gilligan");
		Tv tv3 = new Tv(2011, "Black Mirror", "Sci-Fi", "Charlie Brooker");
		Tv tv4 = new Tv(1994, "Friends", "Comedy", "David Crane");
		Tv tv5 = new Tv(2004, "Lost", "Adventure", "J.J. Abrams");
		tvR.addTv(tv1);
		tvR.addTv(tv2);
		tvR.addTv(tv3);
		tvR.addTv(tv4);
		tvR.addTv(tv5);
		// movie list
		Movie m1 = new Movie("1972", "The Godfather", "Crime", "Francis F Coppola");
		Movie m2 = new Movie("2014", "Interstellar", "Adventure", "Christopher Nolan");
		Movie m3 = new Movie("1994", "The Lion King", "Animation", "Roger Allers");
		Movie m4 = new Movie("1999", "Fight Club", "Drama", "David Fincher");
		Movie m5 = new Movie("1968", "2001:A Space Odyssey", "Sci-Fi", "Stanley Kubrick");
		movieR.addMovie(m1);
		movieR.addMovie(m2);
		movieR.addMovie(m3);
		movieR.addMovie(m4);
		movieR.addMovie(m5);
		// music list
		Music music1 = new Music(1997, "OK Computer", "CD", "Radiohead");
		Music music2 = new Music(2007, "Snakes and Arrows", "DVD", "Rush");
		Music music3 = new Music(2004, "Funeral ", "CD", "Arcade Fire");
		Music music4 = new Music(2007, "Rock Montreal & Live", "Blu Ray", "Queen");
		Music music5 = new Music(2007, "Wish You Were Here", "DVD", "Pink Floyd");
		musicR.addMusic(music1);
		musicR.addMusic(music2);
		musicR.addMusic(music3);
		musicR.addMusic(music4);
		musicR.addMusic(music5);
		// customer list
		Customer c1 = new Customer("Amilcar Aponte", "0831112222", "Premium");
		Customer c2 = new Customer("Greg South", "4198574525", "VideoLover");
		Customer c3 = new Customer("Michael Weiss", "41986325412", "tvLover");
		Customer c4 = new Customer("Bruna de Oliveira", "41997456328", "MusicLover");
		cR.addCustomer(c1);
		cR.addCustomer(c2);
		cR.addCustomer(c3);
		cR.addCustomer(c4);

		// welcome message
		welcomeMessage();
		// main menu
		int op;
		do {
			System.out.println("\n===> Main Menu =================");

			System.out.println("|    1 - Add new Customer      |");
			System.out.println("|    2 - Add new Title         |");
			System.out.println("|    3 - Rent a Title          |");
			System.out.println("|    4 - Return a Title        |");
			System.out.println("|    5 - All Titles            |");
			System.out.print("\n Option: ");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				allCustomers();
				customer();
				break;
			case 2:
				add();
				break;
			case 3:
				rent();
				break;
			case 4:
				returnTitle();
				break;
			case 5:
				listMovieAZ();
				allMovies();
				listMusicAZ();
				allMusic();
				listTvAZ();
				allTv();
				break;
			default:
				System.out.println("===> Error Reading Input\n");
				break;
			}
		} while (op != 0);

	}

	// customer menu
	private static void customer() {

		int op;
		do {
			System.out.println("\n===> Choose an option:==========");
			System.out.println("|    1 - Add New Customer      |");
			System.out.println("|    0 - Main Menu             |");
			System.out.print("\n  Option: ");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {

			case 1:
				addCustomer();
				break;
			case 0:
				main(null);
				break;
			default:
				System.out.println("===> Error Reading Input\n");
				break;
			}

		} while (op != 0);
	}

	// add menu
	private static void add() {
		// TODO Auto-generated method stub
		int op;
		do {
			System.out.println("\n===> Add a: ====================");
			System.out.println("|    1 - Movie                 |");
			System.out.println("|    2 - Music         	       |");
			System.out.println("|    3 - Tv Serie              |");
			System.out.println("|    0 - Menu                  |");
			System.out.print("\n Option: ");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				addMovie();
				break;
			case 2:
				addMusic();
				break;
			case 3:
				addTv();
				break;
			case 0:
				main(null);
				break;
			default:
				System.out.println("===> Error Reading Input\n");
				break;
			}
		} while (op != 0);

	}

	// rent menu
	private static void rent() {
		// TODO Auto-generated method stub
		int op;
		do {
			System.out.println("\n===> Rent a: ==================");
			System.out.println("|    1 - Movie                |");
			System.out.println("|    2 - Music                |");
			System.out.println("|    3 - Tv Serie             |");
			System.out.println("|    0 - Menu                 |");
			System.out.print("\n Option: ");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				moviesAvailable();
				rentMovie();
				break;

			case 2:
				musicAvailable();
				rentMusic();
				break;
			case 3:
				tvAvailable();
				rentTv();
				break;
			case 0:
				main(null);
				break;
			default:
				System.out.println("===> Error Reading Input\n");
				break;
			}
		} while (op != 0);

	}

	// return menu
	private static void returnTitle() {
		// TODO Auto-generated method stub
		int op;
		do {
			System.out.println("\n===> Return a: =================");
			System.out.println("|    1 - Movie                 |");
			System.out.println("|    2 - Music         	       |");
			System.out.println("|    3 - Tv Serie              |");
			System.out.println("|    0 - Menu                  |");
			System.out.print("\n Option: ");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				allMovies();
				returnMovie();
				break;
			case 2:
				allMusic();
				returnMusic();
				break;
			case 3:
				allTv();
				returnTv();
				break;
			case 0:
				main(null);
				break;
			default:
				System.out.println("===> Error Reading Input\n");
				break;
			}
		} while (op != 0);

	}

}
