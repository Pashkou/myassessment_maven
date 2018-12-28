package hackerrank.com.arrays;

public class Solution1 {
	public int hourglassSum(int[][] arr) {
		Integer maxSum = null;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				
				int sum = -0;
				sum += arr[i][j];
				sum += arr[i][j + 1];
				sum += arr[i][j + 2];

				sum += arr[i + 1][j + 1];

				sum += arr[i + 2][j];
				sum += arr[i + 2][j + 1];
				sum += arr[i + 2][j + 2];
			    
				if((maxSum == null) ||  (sum > maxSum)) {
					maxSum = sum;
				}
				
			}
		}
		return maxSum;
	}
}
