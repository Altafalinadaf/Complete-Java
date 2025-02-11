package programs;

import java.util.Scanner;

public class checknumberispresentinarrayornot {
	public static void main(String args[]) {
		int[] arr= {1,2,3,6,5,4,9,8,7,12,54,85};
		System.out.print("Enter the number: ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		boolean isInArray=false;
		for (int num:arr) {
			if(num==number) {
				//System.out.println("The given number is in the list");
				isInArray=true;
				break;
				
			}
		}
		if (!isInArray) {
			//System.out.println("The given number is in the list");
			System.out.println("The given number is not in the list");
			
		}
//		else {
//			System.out.println("The given number is not in the list");
//		}
		input.close();
	}

}
