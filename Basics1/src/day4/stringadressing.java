package day4;

import java.util.Scanner;

public class stringadressing {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Ali"; // string containing the no.of character 
		System.out.println(str.charAt(2)); // addressing the char position
		
		Scanner sc=new Scanner(System.in);
		String ip=sc.next(); // input the string
		char c=ip.charAt(0);  //addressing the char
		System.out.println(c); // print c
		
		char d=sc.next().charAt(0); // short line for those upper 2 line write into single line
		System.out.println(d);
		
		char r='1'; // ASCII
		System.out.println(r);
		sc.close();
		

		
		
		
		
	}

}
