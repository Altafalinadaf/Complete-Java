package programs;

import java.util.Scanner;

public class percentageconverter {
	public static void main(String args[]) {
		// Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user for number of subjects
        System.out.print("Enter the number of SubjectS: ");
        int numSubjects = sc.nextInt();

        // Initialize total marks and maximum marks
        int totalMarks = 0;
        int maxMarks = 100 * numSubjects;  

        // Loop through each subject and prompt user for marks
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        // Calculate percentage
        double percentage = (double)totalMarks / maxMarks * 100;

        // Display percentage
        System.out.println("Your overall percentage is: " + percentage + "%");
        
        sc.close();


				
	}

}
