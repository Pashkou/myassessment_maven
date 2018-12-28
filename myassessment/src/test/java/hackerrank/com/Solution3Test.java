package hackerrank.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution3Test {

	@Test
	public void jumpingOnCloudsTest() {
		int[] c = {0, 0, 1, 0, 0, 1, 0};
		assertEquals(4, new Solution3().jumpingOnClouds(c));
		
		int[] d = {0, 0, 0, 0, 1, 0};
		assertEquals(3, new Solution3().jumpingOnClouds(d));
		
		int[] e = {0, 0, 0, 1, 0, 0};
		assertEquals(3, new Solution3().jumpingOnClouds(e));
		
		
	} 
}
