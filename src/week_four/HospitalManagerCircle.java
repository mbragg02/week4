package week_four;

public class HospitalManagerCircle {
	
	private PatientCircle patientListStart;
	
	public HospitalManagerCircle() {
		patientListStart = null;
	}


	public static void main(String[] args) {
		
		HospitalManagerCircle hmc = new HospitalManagerCircle();
		
		hmc.launch(hmc);
	}
	
	private void launch(HospitalManagerCircle hmc) {
		
		PatientCircle firstPatient = new PatientCircle("John", 33, "Tuberculosis");
		PatientCircle secondPatient = new PatientCircle("Mary", 66, "Meningitis"); 
		PatientCircle thirdPatient = new PatientCircle("Michael", 24, "cold");
		PatientCircle fouthPatient = new PatientCircle("Sam", 29, "cancer");
		
		hmc.add(firstPatient);
		hmc.add(secondPatient);
		hmc.add(thirdPatient);
		hmc.add(fouthPatient);
		
		hmc.prettyPrint();
		
		
		hmc.remove(secondPatient);
		
		hmc.prettyPrint();
		
		System.out.println(returnSize());
		
		
		
		
	}
	
	public void add(PatientCircle newPatient) {
		
		if (patientListStart == null) {
			patientListStart = newPatient;
			newPatient.setNext(newPatient);
			return;
		}
		
		PatientCircle aux = patientListStart;
		
		while(aux.getNext() != patientListStart) {
			aux = aux.getNext();
		}
		aux.setNext(newPatient);
		newPatient.setNext(patientListStart);	
		
	}
	
	
	
	public void remove(PatientCircle x) {
		
		if (patientListStart == null) {
			return;
		}
		
		PatientCircle aux = patientListStart;
		
		while(aux.getNext() != patientListStart) {
			
			if (aux.getNext().getName().equals(x.getName())) {
			aux.setNext(x.getNext());				
			}
			aux = aux.getNext();
		}
	}
	
	public int returnSize(){
		PatientCircle current = patientListStart;
		int counter = 0;
		do {
			current = current.getNext();
			counter++;
			
		}while (current != patientListStart);
		
		return counter;
		
//		return patientListStart.size();
	}
	
	
	
	
	public void prettyPrint(){
		System.out.println("------------------");
		System.out.println("Print forward");
		System.out.println("------------------");
		PatientCircle current = patientListStart;
		
		do {
			System.out.println("Patient: " + current.getName());
			System.out.println("Next Patient: " + current.getNext().getName());
			System.out.println("------------------");
			current = current.getNext();
			} while (current != patientListStart);
	}
	
	

}
