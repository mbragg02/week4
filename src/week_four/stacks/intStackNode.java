package week_four.stacks;

/**
 * A node in a dynamic singly-linked list of Integers
 */
public class intStackNode {
    private int value;
    private intStackNode next;

    public intStackNode(int value) {
	  this.value = value;
	  next = null;
    }

    /**
     * Returns the int  in this node
     */
    public int getValue() {
	  return value;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(intStackNode node) {
	  next = node;		
    }

    /**
     * Set the next node to point to the given node
     */
    public intStackNode getNext() {
	  return next;		
    }
}