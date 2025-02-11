package programs;

import java.util.Scanner;

public class Reverse_Order {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=scanner.nextInt();
		for (int i=num;i>0;i--) {
			System.out.println(i);
		}
		scanner.close();
	}

}
