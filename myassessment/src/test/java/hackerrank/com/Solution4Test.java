package hackerrank.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution4Test {

	@Test
	public void repeatedStringTest() {
		assertEquals(7, new Solution4().repeatedString("aba", 10));
		
		assertEquals(10000000l, new Solution4().repeatedString("a", 10000000l));
		assertEquals(10000000000l, new Solution4().repeatedString("a", 10000000000l));
		             
			         
	}
}
