package JavaImportantPrograms;

import java.util.Scanner;
// give an input and then take each number and apply factorial for each number and the sum it 
/*
 * example :
 *  num=145
 *  5!=5x4x3x2x1=120
 *  41=4x3x2x1=24
 *  1!=1=1
 *  sum=120+24+1
 *  sum=145
 *  num==sum // 145 == 145
 *  then it's "Strong Number" 
 */

public class StrongNumber {
	static void FactSum(int n) {
		int temp=n;
		int fact=1;
		int sum=0;
		while(n>0) {
			fact=1;
			int rem=n%10;
//			sum=sum+fact(rem);
		//	System.out.println(rem);
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
				
			}
		//	System.out.println(fact);
		
			n/=10;
			sum+=fact;
			System.out.println(sum);
		
		}
		System.out.println("The sum of factorial Of each Number : "+fact);
		if(sum==temp) {
			System.out.println("Strong Number ");
		}
		else {
			System.out.println("Not a Strong Number ");
		}
	}
	
//	static int fact(int n) {
//		int fac=1;
//		for(int i=1;i<=n;i++) {
//			fac*=i;
//		}
//		return fac;
//	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int num=scanner.nextInt();
		FactSum(num);
		scanner.close();
	}


}
