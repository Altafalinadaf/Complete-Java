package day3;

import java.util.Scanner;

public class condition {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a>10) {
			System.out.println("number is grather than 10");
		}else {
			System.out.println("number is less than 10");
		}
		sc.close();
	}  
}
