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
	
	
	
	
	
	public void addPatient(PatientDouble newPatient) {
		if (this.nextPatient == null) {
			
			
//			this.previousPatient = ;

			this.nextPatient = newPatient;
		} else { 
			
			this.nextPatient.addPatient(newPatient);
		} 
	}
	
	
	
	public void displayPatient() {
		prettyPrint(this);
		prettyPrint(previousPatient);
	}
	
	public void displayNextPatient() {
		prettyPrint(nextPatient);
	}
	
	private void prettyPrint(PatientDouble patient) {
		System.out.println(patient.name + ", " + patient.age + ", " + patient.illness);
	}
	
	public PatientDouble returnNextPatient() {
		return nextPatient;
		
	}
	
	
	
	
	
	public boolean deletePatient(PatientDouble patient) { 
		
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
