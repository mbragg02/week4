package bubble_sort;

public class BubbleSortScript {


	public static void main(String[] args) {
		BubbleSortScript launcher = new BubbleSortScript();
		launcher.launch();

	}
	
	private void launch() {
	
		
		IntegerList listToSort = new IntegerList();
//		listToSort.add(54);
//		listToSort.add(25);
//		listToSort.add(5);
//		listToSort.add(74);
//		listToSort.add(23);
//		listToSort.add(6);
		
//		listToSort.add(54);
//		listToSort.add(2);
//		listToSort.add(23);
//		listToSort.add(211);
//		listToSort.add(56);
//		listToSort.add(5);

		
//		listToSort.add(54);
//		listToSort.add(2);
//		listToSort.add(23);
//		listToSort.add(211);
//		listToSort.add(56);
//		listToSort.add(5);
		
		
		listToSort.prettyPrint();
		
		System.out.println("///////");
		
		listToSort = ListUtilities.bubbleSort(listToSort);
		listToSort.prettyPrint();
		
	}

}
