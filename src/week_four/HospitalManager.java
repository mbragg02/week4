package week_four;

public class HospitalManager {
	
	private Patient patientListStart = null;


	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
		

	}
		
	private void launch() {
		
		Patient firstPatient = new Patient("John", 33, "Tuberculosis"); 
		patientListStart = firstPatient;
		
		Patient secondPatient = new Patient("Mary", 66, "Meningitis"); 
		patientListStart.addPatient(secondPatient);
		
		Patient thirdPatient = new Patient("Michael", 24, "cold"); 
		patientListStart.addPatient(thirdPatient);
		
		Patient fouthPatient = new Patient("Sam", 29, "cancer"); 
		patientListStart.addPatient(fouthPatient);
		
//		secondPatient.displayPatient();
		
		System.out.println("Patient cue: " + patientListStart.size());
		

		
//		secondPatient.displayNextPatient();
//		secondPatient.printPatient();
		
		displayAllPatients();
		
		
		patientListStart.deletePatient(secondPatient);

		displayAllPatients();
		patientListStart.deletePatient(thirdPatient);
		displayAllPatients();
		
		
	}
	
	private void displayAllPatients() {
		// 2: Display all patients info
		Patient firstPatient = patientListStart;
		while (patientListStart != null) {
			patientListStart.displayPatient();
			patientListStart = patientListStart.returnNextPatient();
			}
		patientListStart = firstPatient;
	}

}
