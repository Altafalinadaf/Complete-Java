package programs;

import java.util.Scanner;

public class SingleDigitNumber {
	static int sumOfNumber(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum +=rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		//num=sumOfNumber(num);
		while(num>9) {
			num=sumOfNumber(num);
		}
		if(num==1 || num==7) {
			System.out.println("Happy Number ");
		}
		else {
			System.out.println("Not Happy Number");
		}
//		if(sumOfNumber(num)==1 || sumOfNumber(num)==7) {
//			System.out.println("Happy Number ");
//		}
//		else {
//			System.out.println("Not happy Number ");
//		}
		sc.close();
		
	}

}
