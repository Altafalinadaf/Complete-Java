package programs;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String args[]) {
		int sum=0,num;
		System.out.println("Enter the number of natural number:");
		// (0,1,2,3, , , , n) are natural number
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		
//		for (int i=0;i<=num;i++) {
//			sum=sum+i; //addd all numbers like 5(1+2+3+4+5=15)
//		}
//		System.out.println(sum);
		
		
			for (int i=1;i<=num;i++) {
				sum =sum+i;
			}
			System.out.println(sum);
			
		//}
		input.close();

		
	}

}