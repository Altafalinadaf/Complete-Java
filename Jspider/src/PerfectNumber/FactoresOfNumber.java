package PerfectNumber;

import java.util.Scanner;

public class FactoresOfNumber {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=s1.nextInt();
		
		for(int i=1;i<=num/2;i++) { // if i initialize int i=0 it throws exception error
			if(num%i==0) {
				System.out.println(i);
			}
		}
		s1.close();
	}

}
