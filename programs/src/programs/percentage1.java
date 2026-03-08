package programs;

import java.util.Scanner;

public class percentage1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Subjects : ");
		int sub=sc.nextInt();
		int total_marks=sub*100;
		int obtain_marks=0;
		
		for(int i=0;i<sub;i++) {
			System.out.print("Enter the subject "+i+ " marks : ");
			int sub1=sc.nextInt();
			obtain_marks+=sub1;
		}
		double percentage=(double)obtain_marks/total_marks*100;
		System.out.println("The total Percentage is : "+percentage);
		sc.close();
		 
	}
}
