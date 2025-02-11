package looparray1;

import java.util.Scanner;

public class looping {
	public static void main(String args[]) {
		System.out.println("Enter the number of times print:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<num;i++) {
			
			System.out.println("Hello world!");
		}
		input.close();
	}
	

}
