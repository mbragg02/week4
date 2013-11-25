package week_four;

import java.util.Scanner;


public class IntegerList {
	
	private IntegerNode first;
	
	
	public IntegerList() {
		first = null;
	}
	
	
	public void add(int n) {

		IntegerNode newNumber = new IntegerNode(n);
		
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
	
	public void prettyPrint() {
		IntegerNode current = first;
		while(current != null) {
			System.out.println(" " + current.getNumber());
			current = current.getNext();
		}
	}
	
	
	

	public static void main(String[] args) {
		int input;
		IntegerList list = new IntegerList();
		Scanner in = new Scanner(System.in);

		do {
			
			System.out.print("Please enter a number: ");
			input = in.nextInt();
			list.add(input);
			
		} while (input != 0);
		in.close();
		list.prettyPrint();
	}

}
