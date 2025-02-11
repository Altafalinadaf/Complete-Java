package programs;

import java.util.Scanner;

public class leapyearornot {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=input.nextInt();
		// if a year is divisible by 100 and 400 is leap
		if ((year%100==0) && (year%400==0)){
			System.out.println("Leap Year");
			// if year is not divisible by 100,and divisible by 4 is leap
		}else if((year%100!=0) && (year%4==0)){ //number is not divisible by 100 but 4
			
			System.out.println("Leap Year");// div by 100,but not 400; not div by 100 and 400
			
		}else{ //not divisible by 100,400
			System.out.println("Not Leap Year");
		}
		input.close();

		
		
	}

}
