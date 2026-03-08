package PatternPrintting;

import java.util.Scanner;

public class X_Print1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.print("Please Enter the Odd Number : ");
			num=scanner.nextInt();
		}
		for(int row=1;row<=num;row++) {
			
			for(int col=1;col<=num;col++) {
				if(col==row || col==(num-row+1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
