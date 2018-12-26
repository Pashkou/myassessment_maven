package siarhei.pashkou.myassessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	List<Integer> required_multiples = Arrays.asList(3, 5);

	public int solution(int number) {
		List<Integer> multiples = new ArrayList<Integer>();
		for (int i = 1; i < number; i++) {
			if (processSingleValue(i)) {
				multiples.add(i);
			}
		}
		return multiples.stream().mapToInt(i -> i).sum();
	}

	private boolean processSingleValue(int i) {
		for (Integer multiply : required_multiples) {
			if (i % multiply == 0) {
				return true; 
			}
		}
		return false;
	}
}
