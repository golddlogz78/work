package lab.oodp.io.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.io.numchar.CharCounter;

public class TestCharCounter {
	CharCounter cr;

	@Before
	public void setup() {
		cr = new CharCounter();
		cr.start();
	}

	@Test
	public void testNumEs() {
		assertEquals(5, cr.getNumE());
	}
	
	@Test
	public void testTotal() {
		assertEquals(48, cr.getTotal());
	}

}
