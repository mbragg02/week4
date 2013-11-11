package week_four;

public class HospitalManagerDouble {
	
	private PatientDouble patientListStart;
	/**
	 * Constructor. Set the start position to null.
	 */
	public HospitalManagerDouble() {
		patientListStart = null;
	}
	

	public void add(PatientDouble newPatient) {
//		Create a new PatientDouble object
//		PatientDouble newPatient = new PatientDouble(name, age, illness); 
		
//		If the list is empty. ie the start position is null.
		if (patientListStart == null) {
//			Then set the new patient to the start
			patientListStart = newPatient;
			return;
		}
		
//		Start from the beginning of the list 
		PatientDouble aux = patientListStart;
		
//		Iterate through the list checking if getNext is equal to null. ie. It has reached the end of the list.
		while(aux.getNext() != null) {
//			Set aux to the next position
			aux = aux.getNext();
		}
		newPatient.setPrevious(aux);
		aux.setNext(newPatient);	 
	}
	
	
	public void remove(PatientDouble x) {
		
		if (patientListStart == null) {
			return;
		}
		
		PatientDouble aux = patientListStart;
		
		while(aux.getNext() != null) {
			
			if (aux.getName().equals(x.getName())) {
			aux.getPrevious().setNext(x.getNext());
			aux.getNext().setPrevious(x.getPrevious());
				
			}
			aux = aux.getNext();
		}
		
		patientListStart.reduceSize();
	}
	
	
	
	
	
	public void prettyPrintForward() {
		System.out.println("------------------");
		System.out.println("Print forward");
		System.out.println("------------------");

		
		PatientDouble current = patientListStart;

		while(current != null) {
//			if (current.getPrevious() != null ){
//				System.out.println("Previous Patient: " + current.getPrevious().getName());
//			}
			System.out.println("Patient: " + current.getName());
			
//			if (current.getNext() != null ){
//				System.out.println("Next Patient: " + current.getNext().getName());
//
//			}
//			System.out.println("------------------");
			current = current.getNext();
			
		}
				
//		System.out.println("Number of Patients: " + patientListStart.size());
		
	}
	
	public void prettyPrintBackward() {
		System.out.println("------------------");
		System.out.println("Print Backward");
		System.out.println("------------------");

		
		PatientDouble current = patientListStart;
		PatientDouble currentLast = patientListStart;

		while(current != null) {
			current = current.getNext();
			if (current != null) {
				currentLast = currentLast.getNext();
			}
		}
				
		while(currentLast != null) {
			
//			if (currentLast.getPrevious() != null ){
//				System.out.println("Previous Patient: " + currentLast.getPrevious().getName());
//			}
			System.out.println("Patient: " + currentLast.getName());
			
//			if (currentLast.getNext() != null ){
//				System.out.println("Next Patient: " + currentLast.getNext().getName());
//
//			}
//			System.out.println("------------------");
			currentLast = currentLast.getPrevious();
			
		}
	
	}
	

	public static void main(String[] args) {
		
		HospitalManagerDouble hmd = new HospitalManagerDouble();
		
		hmd.launch(hmd);
	}
	
	private void launch(HospitalManagerDouble hmd) {
		
		PatientDouble firstPatient = new PatientDouble("John", 33, "Tuberculosis");
		PatientDouble secondPatient = new PatientDouble("Mary", 66, "Meningitis"); 
		PatientDouble thirdPatient = new PatientDouble("Michael", 24, "cold");
		PatientDouble fouthPatient = new PatientDouble("Sam", 29, "cancer"); 
		
		hmd.add(firstPatient);
		hmd.add(secondPatient);
		hmd.add(thirdPatient);
		hmd.add(fouthPatient);

		
		
		hmd.prettyPrintForward();
		hmd.prettyPrintBackward();
		
		hmd.remove(secondPatient);
		
		hmd.prettyPrintForward();

		
		
	}
	
}
