package programs;

import java.util.Scanner;

public class Leap_year_or_not_using_condition_operator {
	
	// both the programs are same
	/*
	 * static boolean leapYear(int n) {
		boolean div4=(n%4==0);
		boolean div400=(n%400==0);
		boolean div100=(n%100==0);
		return (div4 && !div100)||div400;
	}
	public static void main(String[] args) {
		int num=2024;
		if(leapYear(num)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("not a leap year");
		}
	}
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		sc.close();
		System.out.print("Enter the Year :");
		year=sc.nextInt();
		boolean is_leap_year=((year%4==0)&&(year%100!=0)) || (year%400==0);
		
		if (is_leap_year) {
			System.out.println("Year "+year+" is Leap Year");
		}
		else {
			System.out.println(("Year "+year+" is Not Leap Year"));
		}
	}

}
