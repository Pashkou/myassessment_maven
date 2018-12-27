package hackerrank.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution2Test {
	
	@Test
	public void countingValleysTest() {
		int n = 8;
		String s = "UDDDUDUU";
		
		assertEquals(1,  new Solution2().countingValleys(n, s));
	}
}
