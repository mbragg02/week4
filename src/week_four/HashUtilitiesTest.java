package week_four;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class HashUtilitiesTest {
	
	private int randomInput() {

	    Random rand = new Random();
	    int result = rand.nextInt();
	    System.out.println(result);
	    		
		return result;
	}
	
	@Test
	public void testLoop() {
		int numberOfTests = 2000;
		int i = 0;
		
		while (i < numberOfTests) {
			testMaximumShortHash();
			testMinimumShortHash();
			i ++;
		}
		
	}

	/**
	 * Test that output is less than 1000
	 */
	
	public void testMaximumShortHash() {
		
		int hash = randomInput();
		int output = HashUtilities.shortHash(hash);
		
		boolean condition = false;
		if (output < 1000) {
			condition  = false;
		} else {
			condition = true;
		}
				
		assertFalse(condition);
	}
	
	
	
	/**
	 * Test the output is greater than zero
	 */
	
	public void testMinimumShortHash() {
		
		int hash = randomInput();
		int output = HashUtilities.shortHash(hash);
		
		boolean condition = false;
		if (output >= 0) {
			condition  = false;
		} else {
			condition = true;
		}
				
		assertFalse(condition);
		
	}
	
	

}
