package arraysconcept;

import java.util.Scanner;

public class CheckWheatherNumberIsPresentOrNot {
	public static void main(String args[]) {
		int[] numbers= {52,25,75,88,96};
		System.out.print("Enter the number:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		boolean isInArray=false;
		for (int element:numbers) {
			if (element==num) {
				isInArray = true;
				break;
		}	
		}
		if(isInArray) {
			System.out.println("Number is present in the array");
			
		}
		else {
			System.out.println("number is not present in the array");
		}
		input.close();
	}

}
