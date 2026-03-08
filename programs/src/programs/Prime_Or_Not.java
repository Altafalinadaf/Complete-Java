package programs;

import java.util.Scanner;

public class Prime_Or_Not {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the any number 1 to n : ");
		int num=scanner.nextInt();
		@SuppressWarnings("unused")
		int count=0;
		// take example of 3 (num=3)
		for(int i=1;i<=num;i++) {
			
			// 1.step 3%1==0 true,step2. 3%2==0 condition false ,3%3==0 true
			if(num%i==0) {
				// 1.step count=count+1; step2 count=1+1=2;
				count++;
			}
		}
		// if 3==2 (because prime means number is divisible by self and 1 then it's a prime number 
		// a number which is divisible by 1 and number itself it's prime number 
		if(num==2) {  // we can use both num==2 or num==count because count has 2 value we can directly initialize it into 2
			System.out.println("The Number Is Prime");
		}
		else {
			System.out.println("Number is Not Prime ");
		}
		scanner.close();
		
	}

}
