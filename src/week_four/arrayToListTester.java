package week_four;

public class arrayToListTester {

	public static void main(String[] args) {	
		arrayToListTester tester = new arrayToListTester();
		tester.launch();
	}
	
	private void launch() {
		
		int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		
		ListUtilities.arrayToList(array);
		prettyPrint();

		addSorted(7);
		prettyPrint();

	}
	
	
	private void addSorted(int n ) {
		IntegerNode first = ListUtilities.first();
		IntegerNode newNumber = new IntegerNode(n);
		
		if (first == null) {
			first = newNumber;
			return;
		}
		
		IntegerNode aux = first;
		while(aux.getNext() != null) {
			
			if (aux.getNumber() < n && aux.getNext().getNumber() > n) {
				newNumber.setNext(aux.getNext());

				aux.setNext(newNumber);
			} else {
//				System.out.println(aux.getNumber());

				aux = aux.getNext();

				
			}
		}
		
		
	}
	
	public void prettyPrint() {
		IntegerNode current = ListUtilities.first();
		while(current != null) {
			System.out.println(" " + current.getNumber());
			current = current.getNext();
		}
		System.out.println("-------------");

	}
	
	
	

	
	


}
