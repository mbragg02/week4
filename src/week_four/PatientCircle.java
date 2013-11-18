package week_four;

public class PatientCircle {
	
	private String name;
	private int age;
	private String illness;
	private PatientCircle nextPatient;
//	private PatientCircle previousPatient;
	
	public PatientCircle(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
//		this.previousPatient = null;
	}
	
	public String getName() {
		return name;
	}
	
	public PatientCircle getNext() {
		return nextPatient;
	}
	
	public void setNext(PatientCircle n) {
		this.nextPatient = n;
	}
	
	
//	public PatientDouble getPrevious() {
//		return previousPatient;
//	}
//	
//	public void setPrevious(PatientDouble n) {
//		this.previousPatient = n;
//	}


}
