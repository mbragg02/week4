package week_four;

public class HashUtilities {
	
	
	public static int shortHash(int x) {
		x = Math.abs(x);
		
		while ( x > 1000) {
			
			x = x / 2;
			
		}
		
		
		
		return x;
	}

}
