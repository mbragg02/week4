package week_four;

public class Patient {
	
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private static int counter;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		counter++;
	}
	
	public int size() {
		return counter;
	}
	
	
	
	
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else { 
			this.nextPatient.addPatient(newPatient);
		} 
	}
	
	public void displayPatient() {
		prettyPrint(this);
	}
	
	public void displayNextPatient() {
		prettyPrint(nextPatient);
	}
	
	private void prettyPrint(Patient patient) {
		System.out.println(patient.name + ", " + patient.age + ", " + patient.illness);
	}
	
	public Patient returnNextPatient() {
		return nextPatient;
		
	}
	
	
	public boolean deletePatient(Patient patient) { 
		
		if (this.nextPatient == null) {
			System.out.println("debug");
			return false;
			
		} else if (this.nextPatient.name.equals(patient.name)) {
		// We found it! It is the next one!
		// Now link this patient to the one after the next 
			this.nextPatient = nextPatient.nextPatient; 
			return true;
		} else {
		return this.nextPatient.deletePatient(patient);
		} 
	}

	
	
	

}
