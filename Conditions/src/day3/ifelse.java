package day3;

import java.util.Scanner;

public class ifelse {
	public static void main(String args[]) {
		// if,else if conditions code
	
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
	
		if (a<10) {
			System.out.println("number is less then 10");
		
		}
		else if(a<=20) {
			System.out.println("number is between 10 to 20");
		}
		else if(a<30) {
			System.out.println("number is less than 30");
			
		}
		else {
			System.out.println("number is greater then 30");
		}
		sc.close();
	
	}

}
