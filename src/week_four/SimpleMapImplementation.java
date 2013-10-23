package week_four;

public class SimpleMapImplementation implements SimpleMap {
	
	private SimpleMapNode mapStart;
	
	public SimpleMapImplementation() {
		mapStart = null;
	
	}
	

	public void put(int key, String name) {
		SimpleMapNode newNode = new SimpleMapNode(key, name);
		
		if (mapStart == null) {
			mapStart = newNode;
			return;
		}
		SimpleMapNode aux = mapStart;

		
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(newNode);
		
	}



	public String get(int key) {
		String result = "";
		
		
		return result;
	}

	


	public void remove(int key) {
		
	}


	public boolean isEmpty() {
			
		
		return false;
	}

}
