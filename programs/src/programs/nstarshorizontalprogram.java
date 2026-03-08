package programs;

import java.util.Scanner;

public class nstarshorizontalprogram {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=0;i<num;i++) {
			System.out.println("*");
		}
		input.close();
	}

}