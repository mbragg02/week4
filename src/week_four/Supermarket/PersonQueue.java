package week_four.Supermarket;

public interface PersonQueue {
	
	/**
	 * Add another person to the cue.
	 */
	void insert(Person person);
	
	/**
	 * Removes a person from the cue.
	 */
	Person retrieve();
	
	/**
	 * Returns the size of the cue
	 */
//	int getSize();

}
