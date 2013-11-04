package week_four;

public class HashUtilities {
	
	
	public static int shortHash(int x) {
		x = Math.abs(x);
		x = x % 999;
		return x;
	}

}
