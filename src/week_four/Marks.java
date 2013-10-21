package week_four;

import java.util.Scanner;

public class Marks {
	
	public void setMarks(){
		Scanner in = new Scanner(System.in);
		int mark = 0;
		int studentCounter = 0;
		int distinctions = 0;
		int passes = 0;
		int failed = 0;
		int invalid = 0;
		do {
			System.out.print("Please enter a mark: ");
			mark = in.nextInt();
			
			if(mark >= 70 && mark <= 100) {
				distinctions ++;
			} 
			if (mark >= 50 && mark < 70) {
				passes++;
			} 
			if (mark >= 0 && mark < 50) {
				failed++;
			}
			if (mark > -1 && mark > 100) {
				invalid++;
			}
			
			studentCounter++;
			if (mark == -1) {
				studentCounter--;
			}
				

			
		} while (mark != -1);
		
		System.out.print("There are " + studentCounter + " students: " + distinctions + " distinctions, " + passes + " pass, " + failed + " fails (plus " + invalid + " invalid).");

		
	}

}
