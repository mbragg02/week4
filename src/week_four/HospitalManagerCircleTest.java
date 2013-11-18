package week_four;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HospitalManagerCircleTest {
	
	private HospitalManagerCircle hmc;
	
	@Before
	public void init() {
		System.out.println("running init");
		hmc = new HospitalManagerCircle();
	}
	
	@After
	public void reset() {
		System.out.println("running reset");
		hmc.prettyPrint();
		hmc = null;
	}
	
	@Test
	public void testAdd() {
		System.out.println("running add");
		PatientCircle firstPatient = new PatientCircle("John", 33, "Tuberculosis");
		PatientCircle secondPatient = new PatientCircle("Mary", 66, "Meningitis"); 
		PatientCircle thirdPatient = new PatientCircle("John2", 33, "Tuberculosis");
		PatientCircle fouthPatient = new PatientCircle("Mary3", 66, "Meningitis"); 
		hmc.add(firstPatient);
		hmc.add(secondPatient);
		hmc.add(thirdPatient);
		hmc.add(fouthPatient);
		int actual = hmc.returnSize();
		int expected = 4;
		assertEquals(expected, actual);
		
		
	}

	@Test
	public void testRemove() {
		System.out.println("running remove");
		PatientCircle firstPatient = new PatientCircle("John", 33, "Tuberculosis");
		PatientCircle secondPatient = new PatientCircle("Mary", 66, "Meningitis"); 
		PatientCircle seconPatient = new PatientCircle("Mary1", 66, "Meningitis"); 
		PatientCircle secodPatient = new PatientCircle("Mary2", 66, "Meningitis"); 
		hmc.add(firstPatient);
		hmc.add(secondPatient);
		hmc.add(seconPatient);
		hmc.add(secodPatient);
		hmc.remove(secondPatient);
		int actual = hmc.returnSize();
		int expected = 3;
		assertEquals(expected, actual);
		
	}

}
