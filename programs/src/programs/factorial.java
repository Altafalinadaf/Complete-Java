package programs;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
		int num,sum=1; // if sum=0; then everything will be 0 because of that we have to take 1.(10*0=0)
		System.out.print("Enter the number of factoral: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if (num==0) {
			System.out.println("Factorial of 0 number is : 0");
		}
		
		else {
			for(int i=1;i<=num;i++) { // 0*1332=0 multiple of 0 is always be a zero
				
				sum *=i;  // sum = sum *i;
			
				System.out.println("Factorial of "+ i+ " number is : "+sum);
				
			}
			System.out.println("The total Factorial of number is : "+sum);
			input.close();
		}
		
		
	}
	

}

