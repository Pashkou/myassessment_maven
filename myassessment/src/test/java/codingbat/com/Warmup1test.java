package codingbat.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Warmup1test {

		@Test
		public void testSleepin() {
			assertTrue(new Warmup1().sleepIn(false, false));
			assertFalse(new Warmup1().sleepIn(true, false));
			assertTrue(new Warmup1().sleepIn(false, true));
		}
		
		@Test
		public void testDiff21() {
			assertEquals(2, new Warmup1().diff21(19));
			assertEquals(11, new Warmup1().diff21(10));
			assertEquals(0, new Warmup1().diff21(21));
		}

		@Test
		public void testNearHundred() {
			  
		}

}
