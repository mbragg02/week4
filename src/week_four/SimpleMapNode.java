package week_four;


public class SimpleMapNode {
	
	private int key;
	private String value;
	private SimpleMapNode next;
	
	public SimpleMapNode(int key, String name) {
		this.key = key;
		this.value = name;
		next = null;
	}
	
	public void insert(int key, String name) {
		this.key = key;
		this.value = name;
	}
	
	public SimpleMapNode getNode() {
		return this;
	}
	
	public SimpleMapNode getNext() {
		return next;
	}
	
	
	public void setNext(SimpleMapNode n) {
		this.next = n;
	}

}
