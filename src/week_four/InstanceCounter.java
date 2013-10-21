package week_four;

public class InstanceCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		
		
		spy2.die();	
		
		Spy spy4 = new Spy(4);
		

	}

}

