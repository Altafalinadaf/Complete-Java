package JavaImportantPrograms;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner aScanner=new Scanner(System.in);
		System.out.print("Enter the Faactors of Number : ");
		int num=aScanner.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		aScanner.close();

	}
}
