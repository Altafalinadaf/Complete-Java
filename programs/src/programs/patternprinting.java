package programs;

import java.util.Scanner;

public class patternprinting {
	static void pattern1(int n) {
		for (int i=0;i<n;i++) {
			for (int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the pattern number: ");
		int n1=sc.nextInt();
		
		pattern1(n1);
		sc.close();
	}

}
