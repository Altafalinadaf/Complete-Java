package Logical_Programming;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character size : ");
		int num=scanner.nextInt();
		char[] c=new char[num];
		System.out.println(c.length);
		for(int i=0;i<c.length;i++) {
			System.out.print("Enter the "+(i+1)+" character : ");
			c[i]=scanner.next().charAt(0);		
		}
		System.out.println("The given char is : ");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		scanner.close();
	}

}
