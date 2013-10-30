package bubble_sort;

public class BubbleSortScript {


	public static void main(String[] args) {
		BubbleSortScript launcher = new BubbleSortScript();
		launcher.launch();

	}
	
	private void launch() {
	
		
		IntegerList list = new IntegerList();
		list.add(54);
		list.add(25);
		list.add(5);
		list.add(74);
		list.add(23);
		list.add(66);
		list.add(47);
		list.prettyPrint();
		
		System.out.println("///////");
		
		list = ListUtilities.bubbleSort(list);
		list.prettyPrint();
		
	}

}
