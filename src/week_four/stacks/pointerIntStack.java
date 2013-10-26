package week_four.stacks;


/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class pointerIntStack implements intStack {
    /**
     * The head of the stack: the visible node
     */
    private intStackNode head;

    public pointerIntStack() {
	  head = null;
    }

    public void push(int newValue) {
    	intStackNode newNode = new intStackNode(newValue);
	  if (head != null) {
		newNode.setNext(head);
	  }
	  head = newNode;	  
    }

    public int pop() {
	  if (head == null) {
		return (Integer) null;
	  }
	  int result = head.getValue();
	  head = head.getNext();
	  return result;
    }

    public int peek() {
	  if (head == null) {
		return (Integer) null;
	  } else {
		return head.getValue();
	  }
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  intStackNode currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
}
