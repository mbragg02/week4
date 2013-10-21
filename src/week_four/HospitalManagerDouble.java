package week_four;

public class HospitalManagerDouble {
	
	private PatientDouble patientListStart = null;
	private PatientDouble patientListEnd = null;

	public static void main(String[] args) {
		
		HospitalManagerDouble hmd = new HospitalManagerDouble();
		hmd.launch();

	}
	
private void launch() {
		
	    PatientDouble firstPatient = new PatientDouble("John", 33, "Tuberculosis"); 
		patientListStart = firstPatient;
//		patientListEnd = firstPatient;
		
			
		PatientDouble secondPatient = new PatientDouble("Mary", 66, "Meningitis"); 
		patientListStart.addPatient(secondPatient );
		
		
		
		
		PatientDouble thirdPatient = new PatientDouble("Michael", 24, "cold"); 
		patientListStart.addPatient(thirdPatient );

		PatientDouble fouthPatient = new PatientDouble("Sam", 29, "cancer"); 
		patientListStart.addPatient(fouthPatient);
		
		
		
		thirdPatient.displayPatient();

		
		
		
		
//		System.out.println("Patient cue: " + patientListStart.size());
		
		
//		while (patientListStart != null) {
//			patientListStart.displayPatient();
//			patientListStart = patientListStart.returnNextPatient();
//			}
//		patientListStart = firstPatient;

		
		
		
	}
	
//	private void displayAllPatients() {
//		// 2: Display all patients info
//		Patient firstPatient = patientListStart;
//		while (patientListStart != null) {
//			patientListStart.displayPatient();
//			patientListStart = patientListStart.returnNextPatient();
//			}
//		patientListStart = firstPatient;
//	}

}
