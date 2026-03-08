package programs;

import java.util.Scanner;

public class Number_Even_Odd_Using_Biwise_Operator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
	//	int num;
		int num=scanner.nextInt();
		if((num & 1)==1) {
			System.out.println("The number is odd");
			
		}
		else if((num & 0)==0) {
			System.out.println("the number is Even");
		}
		scanner.close();
	}

}
