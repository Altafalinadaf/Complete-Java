package looparray1;

import java.util.Scanner;

public class sumofnumber1 {
	public static void main(String args[]) {
		System.out.println("Enter the sum of numbers");
		int sum=0,res;
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		while(num>0) { // while (num!=0) use anyone both are same
			res= num%10;
			sum +=res;
			num /=10;
			System.out.println("Number:"+num+"sum:"+sum);
			
			
		}
		System.out.println("Final sum is:"+sum);
		input.close();
		
	}

}
