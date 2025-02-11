package methodsarguments;

import java.util.Scanner;

public class factorialsofmethodoverloading {
	
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial (n-1);
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Factorial:");
		int num=sc.nextInt();
		System.out.print("The factorial of num is :" +factorial(num));
		sc.close();
		
		
	}

}
