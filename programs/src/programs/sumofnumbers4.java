package programs;

import java.util.Scanner;

public class sumofnumbers4 {
	public static void main(String[] args) {
		int res,sum=0;
		System.out.print("Enter the sum of numbers:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		while(num!=0) {
			System.out.println("Number : "+num+" sum : "+sum);
			res=num%10; // digit here 4
			sum +=res;
			num /=10;
			
			
		}
		System.out.println("final of sum of number is : "+sum);
		input.close();
	}

}
