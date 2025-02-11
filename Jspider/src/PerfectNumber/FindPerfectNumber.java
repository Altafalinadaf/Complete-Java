package PerfectNumber;


import java.util.Scanner;

public class FindPerfectNumber {
	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=s2.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println("The total sum of number is : "+sum);
		if(sum==num) {
			System.out.println("The number is perfect number ");
		}
		else {
			System.out.println("The number is not a perfect number ");
		}
		s2.close();
	}

}
