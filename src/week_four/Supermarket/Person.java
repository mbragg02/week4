package week_four.Supermarket;

public class Person {
	
	
	private String name;
	private Person next;
	private static int counter;

	
	public Person(String name) {
		this.name = name;
		next = null;
		counter ++;
		
	}
	
	public void reduceCounter() {
		counter --;
	}
	
	public int counter() {
		return counter;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getNext() {
		return next;
	}
	
	
	public void setNext(Person n) {
		this.next = n;
	}
	

	

	
	
	
	
	

}
