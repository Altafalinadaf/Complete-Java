package day4;

import java.util.Scanner;

public class smartaddition {
	public static void main(String args[]) {
		System.out.println("Enter the number:");
		int sum=0;
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		sum=num;
		sum +=1; // sum =sum+1; add the value of sum
		System.out.println(sum);
		
		sum -=3; // sum=sum-3; sub the value in sum
		System.out.println(sum);
		
		sum *=9; // mal the value in sum
		System.out.println(sum);
		
		sum /=2; // divide the value in sum
		System.out.println(sum);
		input.close();
		
	}

}
