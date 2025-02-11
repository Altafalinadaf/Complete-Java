package programs;

import java.util.Scanner;

public class sumofevenodd {
	public static void main(String args[]) {
		int i, sum_even = 0, sum_odd = 0,sum_even1 =0,sum_odd1=0;

	    for (i = 1; i <= 10; i++) {
	        if (i % 2 == 0) {
	            sum_even += i; // 2+2=4 
	        } else {
	            sum_odd += i;
	        }


	    }
	    System.out.printf("Sum of even numbers between 1 to 10 is: %d\n", +sum_even);
	    System.out.printf("Sum of odd numbers between 1 to 10 is: %d\n", +sum_odd);
	    
	    // input asking sum of numbers
	    Scanner sc=new Scanner(System.in);
	    System.out.printf("Enter the Sum of Number:");
	    int num=sc.nextInt();
	    for(i=0;i<=num;i++) {
	    	if(i%2==0) { 
	    		sum_even1 +=i; //sum_even1 = sum_even1+i short hand
	    		
	    		
	    	}
	    	else {
	    		sum_odd1 +=i; //sum_odd1 =sum_odd1+i; short hand
	    		
	    	}
	    	sc.close();
	    }
	    System.out.printf("Sum Even Number is: %d\n",+sum_even1);
	    System.out.printf("Sum of Odd Number is: %d\n",+sum_odd1);
	    
	   
	    	
	    }
	    		

	
}

