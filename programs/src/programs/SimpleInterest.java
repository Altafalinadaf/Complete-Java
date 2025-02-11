package programs;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Prinicipal Amount: "); // P=principal,total amount
		double principal=input.nextDouble();
		
		System.out.println("Enter the Rate of Interest: "); // R=rate of interest,amount interest
		double rate=input.nextDouble();
		
		System.out.println("Enter the Time Periods(in year): "); // Time Periods of amount return 
		double time=input.nextDouble();
		
		double simpleInterest=(principal*rate*time)/100; // SI=(P*T*R)/100 
		
		System.out.println("Simple Intereset is:"+simpleInterest);
		input.close();
	}

}
