package week_four.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointerIntStackTest {




	@Test
	public void testPush() {
		intStack s = new pointerIntStack();
		int expected = 5;
		s.push(expected);
		int output = s.peek();
		
		assertEquals(output, expected);

	}

	@Test
	public void testPop() {
		intStack s = new pointerIntStack();
		int expected = 5;
		s.push(expected);
		int output = s.pop();
		
		assertEquals(output, expected);
		boolean empty = s.isEmpty();
		assertEquals(empty, true);
	}

	@Test
	public void testPeek() {	
		intStack s = new pointerIntStack();
		int expected = 5;
		s.push(expected);
		int output = s.peek();
		
		assertEquals(output, expected);
		

	}

	@Test
	public void testIsEmpty() {
		intStack s = new pointerIntStack();
		boolean output = s.isEmpty();
		boolean expected = true;
		assertEquals(output, expected);
		
		
	}
	
	@Test
	public void test2IsEmpty() {
		intStack s = new pointerIntStack();
		int x = 5;
		s.push(x);
		boolean output = s.isEmpty();
		boolean expected = false;
		assertEquals(output, expected);
	}
	
	

	@Test
	public void testGetSize() {
		intStack s = new pointerIntStack();
		int x = 5;
		s.push(x);
		int output = ((pointerIntStack) s).getSize();
		int expected = 1;
		assertEquals(output, expected);
	}

}
