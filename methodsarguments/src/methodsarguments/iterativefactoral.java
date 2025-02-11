package methodsarguments;

import java.util.Scanner;

public class iterativefactoral {
	static int factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	static int factorial_iterative(int n) {
		int sum=1;
		if (n==0 ||n==1) {
			return 1;
		}
		else {
			for (int i=1;i<=n;i++) {
				sum *=i;
			}
			return sum;
		}
	}
	public static void main(String args[]) {
		System.out.print("Enter the factorial number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("factorial of reference number is : "+factorial(num));
		System.out.println("The facorial of iterative number is : "+factorial_iterative( num));
		sc.close();
	}

}
