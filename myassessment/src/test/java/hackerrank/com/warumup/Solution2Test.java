package hackerrank.com.warumup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.com.warmup.Solution2;

public class Solution2Test {
	
	@Test
	public void countingValleysTest() {
		int n = 8;
		String s = "UDDDUDUU";
		
		assertEquals(1,  new Solution2().countingValleys(n, s));
	}
}
