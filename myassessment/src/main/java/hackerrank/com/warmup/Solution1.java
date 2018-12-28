package hackerrank.com.warmup;

public class Solution1 {

	public int sockMerchant(int n, int[] ar) {

		/*int noofPairs = 0;
		Set<Integer> set = new HashSet<>();
		for (Integer item : ar) {
			if(set.contains(item)) {
				 noofPairs++;
				 set.remove(item);
			}else {
				set.add(item);
			}
		}
		return noofPairs;*/
		
		
		int noofPairs = 0;
		boolean[] result = new boolean[100];
		for(int i = 0; i < n; i++) {
			int value = ar[i];
		    if(result[value]) {
		    	result[value] = false;
		    	noofPairs++;
		    }else{
		    	result[value] = true;
		    };
		}
		
		
		return noofPairs;
	}

}
