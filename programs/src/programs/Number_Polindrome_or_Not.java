package programs;

import java.util.Scanner;
//WAP to check whether a 3 digit number is a magic number or not.
//(Palindrome) A number is a magic number if its reverse is same as the
//original number.


public class Number_Polindrome_or_Not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,res,temp;
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		temp=num; // here we take temp and stores the num value in temp that would be help to compare the value
		sc.close();
		while(num>0) {
			res =num%10;  // store the last value in number 
			sum=res+(sum*10);  // store the res value+sum*10 =total value
			num /=10;	// it stores remaining value expect last value in number 	
		}
		if (temp==sum) {  // here we are comparing the both value
		                  // num is changed in program so we can't compare user num to sum so that we stores num values in temp 
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not Polindrome");
		}
	}
}
