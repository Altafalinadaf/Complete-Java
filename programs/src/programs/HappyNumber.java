package programs;

import java.util.Scanner;

public class HappyNumber {
	static int numSumSquare(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*rem;
			n/=10;
		}
		//System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scanner.nextInt();
		while(num>9) {
			num=numSumSquare(num);
		}
		System.out.println(num);
		System.out.println(num);
		if(num==1 || num==7) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not Happy Number ");
		}
		scanner.close();
	}


}
