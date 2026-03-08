package programs;

import java.util.Scanner;

// Perfect Number Means 
// Factors of a given numbers 
// and then add the number 
// if the factors of sum of given number is equal to the user given number the it's a perfect number else not a perfect number 
// input 6
// the factors of '6' is =1,2,3
// sum of facotrs =1+2+3=6
// sum==input 
// 6==6 then 6 is a perfect number 

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=0;i<num;i++) {
			if (num%i==0) {
				sum +=i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect Number ");
		}
		else {
			System.out.println("Not Perfect Number ");
		}
		scanner.close();
	}
	

}
