package week_four;

import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalManagerDoubleTest {
	
	

	@Test
	public void testAdd() {
		HospitalManagerDouble hmd = new HospitalManagerDouble();
		PatientDouble firstPatient = new PatientDouble("John", 33, "Tuberculosis");
		hmd.add(firstPatient);
	
		
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrettyPrintForward() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrettyPrintBackward() {
		fail("Not yet implemented");
	}

}
