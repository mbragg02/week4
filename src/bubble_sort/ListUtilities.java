package bubble_sort;

public class ListUtilities {
	
	//	eldaw@dcs.bbk.ac.uk
	
	public static IntegerList bubbleSort(IntegerList list) {
		IntegerList listToSort = list;
				
		IntegerNode currentNode = listToSort.getFirst();
		
		
		
		while(currentNode.getNext() != null) 
		{	
			IntegerNode temp1 = currentNode;
			IntegerNode temp2 = currentNode.getNext();
			if(temp1.getNumber() > temp2.getNumber()) {
				temp1.setNext(temp2.getNext());
				temp2.getNext().setNext(temp1);
				//currentNode = temp1;		
								
			} else 
			{
				//currentNode = temp2;			
				currentNode = currentNode.getNext();
			}
//			System.out.println("currentNode: "+ currentNode);
			listToSort.prettyPrint();
			System.out.println("///////");
		}
		return listToSort;
	}

	
	
	
}
