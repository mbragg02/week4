package week_four;

public class HashUtilitiesTester {

	public static void main(String[] args) {
		
		String str ="ehojr jiojer jir ejio ";
		int hash = str.hashCode();
		System.out.println(hash);
		
		int shorthash = HashUtilities.shortHash(hash);
		
		System.out.println(shorthash);

	}

}
