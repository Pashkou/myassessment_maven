package hackerrank.com;

public class Solution2 {
	public int countingValleys(int n, String s) {
		int result = 0;
		int level = 0;
		for(char ch:s.toCharArray()) {
			if(ch == 'U') {
				level++;
			}else {
				level--;
			}
		
			if((level == 0) && (ch == 'U')){
				result++;
			}
		}
		return result;
    }
}
