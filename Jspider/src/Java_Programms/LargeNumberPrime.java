package Java_Programms;

import java.util.Scanner;

public class LargeNumberPrime {
	static void checkPrime(int start,int end) {
		int count=0;
		int largest=Integer.MIN_VALUE;
		for(int i=start;i<=end;i++) {
			count=0;
			// sending one, one values to the checkNumber it will check and return the value 
			count=checkNumber(i);
			
			if(count==2) {
				if(largest<i) {
					largest=i;
				}
				
			}
			
		}
		System.out.println("The Laergest Amount user given Range is : "+largest);
	}
	static int checkNumber(int n) {
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
		System.out.println("Please don't enter the starting range 0 and 1 ");
		System.out.println("Enter the starting range : ");
		int startPoint=scanner.nextInt();
		System.out.println("Enter the end points : ");
		int endPoint=scanner.nextInt();
		checkPrime(startPoint,endPoint);
		scanner.close();
	}

}
