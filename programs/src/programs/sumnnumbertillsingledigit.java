package programs;

import java.util.Scanner;

public class sumnnumbertillsingledigit {
	public static void main(String args[]) {
		int num,res,sum=0;
		System.out.println("Enter the positive number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>9) { // check whether the no.is greater than 9 then go. 
			sum=0;  // initialize it to zero. 
			while(num>0) { // if number is greater then 0 means its a positive number.
				res=num%10; // it takes the last digit of number.
				sum=sum+res; // add it into the sum.
				num=num/10;  // it takes all first number expect last number.
			}
			num=sum; // initialize sum to num otherwise it not print as single digit we go once again in loop
		}
		System.out.println(sum);
		sc.close();
				
	
	}

}
