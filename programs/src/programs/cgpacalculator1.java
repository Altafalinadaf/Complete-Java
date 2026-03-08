package programs;

import java.util.Scanner;

public class cgpacalculator1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of subjects : ");
		int n=sc.nextInt();
		
		double totalGradePoints=0;
		int totalCreditHours=0;
		
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the GradePoints for Subject " + i +":");
			double gradePoints=sc.nextDouble();
			
			System.out.print("Enter the CreditHours for Subject " + i +":");
			int creditHours=sc.nextInt();
			
			totalGradePoints +=gradePoints*creditHours;
			totalCreditHours +=creditHours;
			
		}
		double cgpa=totalGradePoints/totalCreditHours;
		System.out.printf("Your CGPA is:%.2f", cgpa);
		sc.close();
	}

}