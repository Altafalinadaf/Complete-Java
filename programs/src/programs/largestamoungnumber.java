package programs;

import java.util.Scanner;

public class largestamoungnumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		int n=sc.nextInt();
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			
	          System.out.print("Enter number " + i + ": ");
	          int num = sc.nextInt();

	          if (num > max) {
	        	  
	              max = num; // update max if num is larger
	          }
	          else if(num<min) {
	        	  min=num;  // update min if num is small
	          }
	     }

	     System.out.println("The largest number amoung is : " + max);
	     System.out.println("The smallest number amoung is : "+min);
		sc.close();
	
	}

}
