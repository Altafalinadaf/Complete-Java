package programs;

import java.util.Scanner;

public class FactorsOfNumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=scanner.nextInt();
		System.out.println("These are the Factors of a Given Numbers : ");
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}

}
