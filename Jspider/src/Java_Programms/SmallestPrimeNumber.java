package Java_Programms;

import java.util.Scanner;

public class SmallestPrimeNumber {
	static void checkPrime(int start,int end) {
		//int count=0;
		int smallest=Integer.MAX_VALUE;
		for(int i=start;i<=end;i++) {
		//	count=0;
//			count=checkRange(i);
			if(checkRange(i)==2) {  // we can directly assign 
				if(smallest>i) {
					smallest=i;
				}
			}
		}
		System.out.println("The Smallest number in given range is : "+smallest);
	}
	static int checkRange(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Starting Range : ");
		int start=scanner.nextInt();
		System.out.println("Enter the Ending Range : ");
		int end=scanner.nextInt();
		if(start>0) {
			checkPrime(start, end);
		}
		else {
			System.out.println("Invalid Range\nStarting range should be starting with 1 ");
		}
		scanner.close();
		
	}

}
