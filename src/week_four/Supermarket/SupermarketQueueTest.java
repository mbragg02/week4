package week_four.Supermarket;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SupermarketQueueTest {

	private SupermarketQueue q = null;
	
	@Before
	public void init() {
		q = new SupermarketQueue();
	}
	
	@After
	public void reset() {
		q = null;
	}
	
	@Test
	public void testInsert() {
		
		// Test an empty que
		int actual = q.getSize();
		int expected = 0;
		assertEquals(actual, expected);
		
		// test a que with one person
		Person somePerson = new Person("name");
		q.insert(somePerson);
		actual = q.getSize();
		expected = 1; 
		assertEquals(actual, expected);
	}

	@Test
	public void testRetrieve() {		
		Person somePerson = new Person("name");
		q.insert(somePerson);
		
		Person expected = q.retrieve();
		assertEquals(somePerson, expected);
	}

	@Test
	public void testGetSize() {		
		// Test an empty que
		int actual = q.getSize();
		int expected = 0;
		assertEquals(actual, expected);
	}

}
