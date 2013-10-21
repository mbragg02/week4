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
		
		secondPatient.printPatient();
		
		System.out.println(secondPatient.deletePatient(secondPatient));
//		secondPatient.printPatient();
	}

}
