package programs;

import java.util.Scanner;

public class multiplication {
	static void mul(int n) {
		for (int i=0;i<=10;i++) {
			System.out.printf("%d X %d =%d\n",n,i,n*i);
		}
		
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number you want to multiply : ");
		int n1=input.nextInt();
		mul(n1);
		input.close();
	}
	

}
