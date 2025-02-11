package SingleDigit;

import java.util.Scanner;

public class Example3 {
	
	static int add(int n) {
		int sum=0,rem=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		System.out.println(add(num));
		
	}

}
