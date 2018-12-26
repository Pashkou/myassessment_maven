package codingbat.com;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Warmup1test {

		@Test
		public void testApp() {
			assertTrue(new Warmup1().sleepIn(false, false));
			assertFalse(new Warmup1().sleepIn(true, false));
			assertTrue(new Warmup1().sleepIn(false, true));
		}
}
