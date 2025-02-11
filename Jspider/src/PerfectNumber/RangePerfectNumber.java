package PerfectNumber;

import java.util.Scanner;

public class RangePerfectNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int range=scanner.nextInt();
		//System.out.println("Enter the number : ");
		//int num=scanner.nextInt();
		int sum=0;
		for(int num=1;num<=range;num++) {
			sum=0;
			for(int i=1;i<=num/2;i++) {
				if (num%i==0){
					sum +=i;
				}
				
			}
			if(sum==num) {
				System.out.println("Perfect Number : "+sum);
			}
			else {
				System.out.println("Not perfect number : "+sum);
			}
			
		}
		scanner.close();
	}

}
