package programs;

import java.util.Scanner;

public class fibonaccinumber {
	static int fib(int n) {
		if (n==1 || n==2) {
			return n-1;
			
		}
		else {
			return fib(n-1)+fib(n-2);
		}
		
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the fibonacci of Numeber : ");
		int num=sc.nextInt();
		System.out.println(fib( num));
//		int result = fib(fib);
//		System.out.println("The fibonacci of "+ fib +" is : "+result);
		sc.close();
	}

}