package week_four.Supermarket;

public class SupermarketQueue implements PersonQueue {
	
	private Person head;
	
	public SupermarketQueue() {
		head = null;
	}
	
	public void insert(Person person) {
		Person newNode = person;
		
		if ( head != null) {
			newNode.setNext(head);
		}
		head = newNode;
		
	}

	
	
	public Person retrieve() {
		
		if (head == null) {
			return null;
		}
		String result = head.getName();
		head = head.getNext();
		return head;
	}
	
	public int getSize() {
		return head.counter();
		
	}

}






