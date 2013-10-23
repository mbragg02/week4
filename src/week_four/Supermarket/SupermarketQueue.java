package week_four.Supermarket;

public class SupermarketQueue implements PersonQueue {
	
	private Person head;
	private Person tail;
	
	public SupermarketQueue() {
		head = null;
		tail = null;
	}
	
	public void insert(Person person) {
		Person newNode = person;
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(tail);
			tail = newNode;
		}
	}

	
	
	public Person retrieve() {
		
		if (head == null) {
			return null;
		}
		
		Person tempNode = tail;
		Person result = head;
		
		while (tempNode.getNext() != head) {
			tempNode = tempNode.getNext();
		}
		
		tempNode.setNext(null);
		head = tempNode;
		head.reduceCounter();
		return result;
	}
	
	
	
	
	
	public int getSize() {
		return head.counter();
		
	}

}






