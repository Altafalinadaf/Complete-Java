package day4;

import java.util.Scanner;

public class square {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		double squareRoot=Math.sqrt(num);
		int intSquareRoot=(int)squareRoot;
		if(squareRoot==intSquareRoot) {
			System.out.println("Number is SquareRoot");
			
		}else {
			System.out.println("Number is not a SqaureRoot");
		}
		sc.close();
		
	}

}
