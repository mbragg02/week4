package week_four.stacks;

public interface intStack {
	
	/*
     * Pushes a new integer onto the stack
     */
    void push(int newValue);

    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    int pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    int peek();

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    boolean isEmpty();

}
