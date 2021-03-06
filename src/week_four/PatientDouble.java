package week_four;

public class PatientDouble {
	
	private String name;
	private int age;
	private String illness;
	private PatientDouble nextPatient;
	private PatientDouble previousPatient;
	private static int counter;
	
	public PatientDouble(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
		counter++;
	}
	
	public int size() {
		return counter;
	}
	
	public void reduceSize() {
		counter --;
	}
	
	public String getName() {
		return name;
	}
	
	public PatientDouble getNext() {
		return nextPatient;
	}
	
	public void setNext(PatientDouble n) {
		this.nextPatient = n;
	}
	
	
	public PatientDouble getPrevious() {
		return previousPatient;
	}
	
	public void setPrevious(PatientDouble n) {
		this.previousPatient = n;
	}

}
