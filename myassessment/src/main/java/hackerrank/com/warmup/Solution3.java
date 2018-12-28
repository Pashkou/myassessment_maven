package hackerrank.com.warmup;

public class Solution3 {
	public int jumpingOnClouds(int[] c) {
		
		int numberOfJumps = 0;
		int i = 0;
		while(i < c.length-1) {
			if((i+2 <= c.length-1) &&  (c[i+2] == 0)) {
				i = i+2;
			}else {
				i = i+1;
			}
			numberOfJumps++;
		}
		
		
		return numberOfJumps;

    }
}
