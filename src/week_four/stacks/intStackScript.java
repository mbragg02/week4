package week_four.stacks;

public class intStackScript {
    public static void main(String[] args) {
    	intStackScript script = new intStackScript();
	  script.launch();
    }

    public void launch() {
	  intStack firstStack = new pointerIntStack();
	  testStack(firstStack);
	
    }

    private void testStack(intStack stack) {
	  System.out.println("Testing the stack..."); 
	  stack.push(1);
	  stack.push(2);
	  stack.push(3);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.push(4);
	  stack.push(5);
	  stack.push(6);
	  stack.push(7);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.pop();
	  stack.pop();
	  stack.push(8);
	  stack.push(9);
	  stack.push(10);
	  stack.push(11);
	  stack.push(12);
	  stack.push(13);
	  System.out.println("Now let's see all the elements in the stack: ");
	  while (!stack.isEmpty()) {
		System.out.println("Next element: '" + stack.pop() + "'");
	  }
    }
}
