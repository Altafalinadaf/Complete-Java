package programs;

import java.util.Scanner;

public class PerfectNumber1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect Number ");
		}
		else {
			System.out.println("Not Perfect ");
		}
		scanner.close();
	}

}
