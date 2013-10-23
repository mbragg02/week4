package week_four;

public class ListUtilities {
	
	private static IntegerNode first;
	
	public ListUtilities() {
		first = null;
	}
	
	public static IntegerNode first() {
		return first;
	}
	
	public static ListUtilities arrayToList (int[] array) {
		
		ListUtilities list = new ListUtilities();
		
		for (int i = 0; i < array.length; i++) {
			
			add(array[i]);
			
		}
		
		return list;
		
		
	} // end of arrayToList method
	
	private static void add(int n) {

		IntegerNode newNumber = new IntegerNode(n);
//		System.out.println(newNumber.getNumber());

		
		if (first == null) {
			first = newNumber;
			return;
		}
		
		IntegerNode aux = first;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(newNumber);
	}

}
