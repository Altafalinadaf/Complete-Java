package TypeCasting;

import java.util.Scanner;

public class Example2 {
	static void disp(int num) {
		char ch=(char)num;
		System.out.println(ch);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numeber : ");
		int num=scanner.nextInt();
		disp(num);
		scanner.close();
	}
	
	

}
