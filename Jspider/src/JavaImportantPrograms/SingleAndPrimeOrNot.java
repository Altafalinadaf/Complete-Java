package JavaImportantPrograms;

import java.util.Scanner;

public class SingleAndPrimeOrNot {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number  : ");
		int num=scanner.nextInt();
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum +=rem;
			num/=10;
		}
		System.out.println("Sum is : "+sum);
		int count=0;
		for(int i=1;i<=sum;i++) {
			if(sum%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Numebr ");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		scanner.close();
	}

}
