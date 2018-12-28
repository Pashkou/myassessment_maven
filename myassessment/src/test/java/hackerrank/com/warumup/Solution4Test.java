package hackerrank.com.warumup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.com.warmup.Solution4;

public class Solution4Test {

	@Test
	public void repeatedStringTest() {
		assertEquals(7, new Solution4().repeatedString("aba", 10));
		
		assertEquals(10000000l, new Solution4().repeatedString("a", 10000000l));
		assertEquals(10000000000l, new Solution4().repeatedString("a", 10000000000l));
		             
			         
	}
}
