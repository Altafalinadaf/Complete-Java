package day3;

import java.util.Scanner;

public class matching {
	public static void main(String args[]) {
//		int age=20;
//		System.out.println("Enter the number:");
//		Scanner sc=new Scanner(System.in);
//		int b=sc.nextInt();
//		if(b==age) {
//			System.out.println("age is 20");
//		}else {
//			System.out.println("age is not 20");
//		}
//		sc.close();
		
		
		int age=30;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int num=scanner.nextInt();
	    if (age==num) {
			System.out.println("the age is 30");
		}
	    else {
	    	System.out.println("the age is not 30");
	    }
	    scanner.close();
	}

}


