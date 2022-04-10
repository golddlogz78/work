package lab.oodp.io.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.io.movie.Movie;
import lab.oodp.io.movie.MovieReader;
import lab.oodp.io.movie.MovieWriter;
import lab.oodp.io.numchar.CharCounter;

public class TestMovie {
	MovieReader cr;
	MovieWriter cw;
	
	String fileName = "movies.dat";

	@Before
	public void setup() {
		cr = new MovieReader();
		cr.setFileName(fileName);
		cw = new MovieWriter();
		cw.setFileName(fileName);
	}

	@Test
	public void testMovieWriteRead() {
		cw.start();
		cr.start();
		Movie[] movies = cw.getMovieData();
		for(int i=0; i< movies.length; i++) {
			assertTrue(cw.getMovieData()[i].equals(cr.getFilms()[i]));
		}
		
		
	}
	

}
