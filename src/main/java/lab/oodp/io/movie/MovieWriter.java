package lab.oodp.io.movie;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import lab.oodp.Keyboard;

public class MovieWriter {
	String fileName = null;
	

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void start() {

		// Get a file name from the user
		if(fileName ==null) {
			System.out.print("Enter a file name: ");
			String fileName = Keyboard.readInput();
		}

		// Create and fill Movies array
		Movie[] films = getMovieData();

		// Saves the movies
		saveMovies(fileName, films);
	}

	/**
	 * Saves the movies to the given file.
	 */
	protected void saveMovies(String fileName, Movie[] films) {
		// TODO: save array of movies: films into a file, uncomment sysout below
		

		//System.out.println("Movies saved successfully to " + fileName + "!");
	}

	/**
	 * Returns an array with a bunch of hard-coded movie data
	 */
	public Movie[] getMovieData() {
		Movie[] films = new Movie[19];
		films[17] = new Movie("The Intouchables", 2011, 112, "Olivier Nakache and Eric Toledano");
		films[6] = new Movie("From Russia With Love", 1963, 110, "Terence Young");
		films[14] = new Movie("The Long Voyage Home", 1940, 105, "John Ford");
		films[9] = new Movie("Easy Rider", 1969, 94, "Dennis Hopper");
		films[3] = new Movie("Dark Shadows", 2012, 113, "Tim Burton");
		films[10] = new Movie("Walk the Line", 2005, 136, "James Mangold");
		films[5] = new Movie("The Help", 2011, 137, "Tate Taylor");
		films[0] = new Movie("Meet the Parents", 2000, 107, "Jay Roach");
		films[7] = new Movie("The King's Speech", 2011, 118, "Tom Hooper");
		films[8] = new Movie("Charlie and the Chocolate Factory", 2005, 115, "Tim Burton");
		films[2] = new Movie("Alice In Wonderland", 2009, 109, "Tim Burton");
		films[4] = new Movie("The Iron Lady", 2011, 105, "Phylliday Lloyd");
		films[11] = new Movie("Kaikohe Demolition", 2004, 52, "Florian Habicht");
		films[12] = new Movie("Brokeback Mountain", 2005, 134, "Ang Lee");
		films[13] = new Movie("Gladiator", 2000, 154, "Ridley Scott");
		films[1] = new Movie("The Parent Trap", 1961, 129, "David Swift");
		films[15] = new Movie("Happy-Go-Lucky", 2008, 118, "Mike Leigh");
		films[16] = new Movie("The Big Wedding", 2013, 89, "Justin Zackham");
		films[18] = new Movie("Searching for Sugar Man", 2012, 86, "Malik Bendjelloul");
		return films;
	}

	public static void main(String[] args) {
		new MovieWriter().start();
	}
}
