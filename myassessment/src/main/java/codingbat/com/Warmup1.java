package codingbat.com;

public class Warmup1 {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(!weekday || vacation) {
			return true;
		}
		return false;
	}
	
	public int diff21(int n) {
		if(n <= 21) {
		  return 21 - n;
		}else {
		  return (n - 21) * 2;	
		}
	}

	public boolean nearHundred(int n) {
		  return false;
	}

}
