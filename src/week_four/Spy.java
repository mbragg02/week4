package week_four;

public class Spy {
	
	private static int spyCount = 0;
	private int spyID;
	
	/**
	 * Constructor
	 */
	public Spy(int id) {
		spyCount++;
		this.spyID = id;
		printSpy(id);
	}
	
	private void printSpy(int id) {
		System.out.println("New Spy, ID: " + id);
		System.out.println("Total number of spies: " + getNumberOfSpies());
	}
	
	public void die(){
		System.out.println("Spy " + this.spyID + " has been detected and eliminated");	
		spyCount--;
		System.out.println("Total number of spies: " + getNumberOfSpies());
	}
	
	
	
	
	private static int getNumberOfSpies() {
		return spyCount;
	}

}
