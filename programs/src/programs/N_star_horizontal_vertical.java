package programs;

import java.util.Scanner;

public class N_star_horizontal_vertical {
	public static void main(String args[]) {
		System.out.println("Enter the star number:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print("* ");//we take print for state line side by side
			
			
		}
		//System.out.println();//for new line
		for (int i=0;i<=num;i++) {
			System.out.println("* ");//print * below in a single line
		}
		input.close();
	}

}