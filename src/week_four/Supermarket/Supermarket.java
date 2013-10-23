package week_four.Supermarket;

public class Supermarket   {
	
	SupermarketQueue theQueue;
	
	public Supermarket() {
		this.theQueue = new SupermarketQueue();
	}

	
	public static void main(String[] args) {
		Supermarket mymarket = new Supermarket();
		
		mymarket.launch();
		
	}
	
	private void launch() {
		
		Person personOne = new Person("adam");
		addPerson(personOne);
		Person personTwo = new Person("sam");
		addPerson(personTwo);
		Person personThree = new Person("michael");
		addPerson(personThree);
		
		System.out.println(theQueue.getSize());
		
		servePerson();
		
		System.out.println(theQueue.getSize());
		servePerson();
		
		System.out.println(theQueue.getSize());

		
		
		
	}
	
	private void addPerson(Person somePerson) {
		
		this.theQueue.insert(somePerson);
		
	}
	
	private void servePerson() {
		System.out.println(this.theQueue.retrieve().getName());

		
	}
	
	

		
		
	


}
