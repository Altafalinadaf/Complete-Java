package programs;

import java.util.Scanner;

public class calculatepercentage {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total sub:");
		double percentage;

		double sub1=sc.nextInt();
		double sub2=sc.nextInt();
		double sub3=sc.nextInt();
		double sub4=sc.nextInt();
		double sub5=sc.nextInt();
		percentage=((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println(percentage);
		sc.close();
		
		
		
	}

}
