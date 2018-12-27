package hackerrank.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void sockMerchantTest() {
		//9
		//10 20 20 10 10 30 50 10 20
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		assertEquals(3, new Solution().sockMerchant(n, ar));
	}
	
}
