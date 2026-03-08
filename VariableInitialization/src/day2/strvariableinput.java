package day2;

import java.util.Scanner;

public class strvariableinput {
	public static void main(String args[]) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the String : ");
		String str=input.next(); // scan the string until it encounter any blank space
		System.out.println(str);
		
		System.out.print("Enter the String 2 : ");
		Scanner input1=new Scanner (System.in);
		String str1=input1.nextLine(); //scan the string hole line
		System.out.println(str1);
		input.close();
		input1.close();
		
		
		
		
	}

}

