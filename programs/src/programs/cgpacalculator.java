package programs;

import java.util.Scanner;

public class cgpacalculator {
	public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);

	        // Get the number of subjects from the user
	        System.out.print("Enter the number of subjects: ");
	        int n = input.nextInt();

	        // Initialize the total grade points and total credit hours to zero
	        double totalGradePoints = 0;
	        int totalCreditHours = 0;

	        // Loop through each subject and get the grade point and credit hour
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter the grade point for subject " + i + ": ");
	            double gradePoint = input.nextDouble();
	            System.out.print("Enter the credit hour for subject " + i + ": ");
	            int creditHour = input.nextInt();
	            totalGradePoints += gradePoint * creditHour;
	            totalCreditHours += creditHour;
	        }

	        // Calculate the CGPA
	        double cgpa = totalGradePoints / totalCreditHours;

	    
	        // Print the CGPA
	        System.out.printf("Your CGPA is: %.2f", cgpa);
			input.close();
	}

}
