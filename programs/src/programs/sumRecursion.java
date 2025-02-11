package programs;

import java.util.Scanner;

public class sumRecursion {
	static int sumRec(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n + sumRec(n-1);
		}
		
	}
	public static void  main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sum of Recursion : ");
		int n=sc.nextInt();
		
	    int c=sumRec(n);
	    System.out.println(c);
	    
	    
	    // output: Enter the sum of Recursion : 4 then it gives 10 
	    // 1 + 2 + 3 + 4 = 10 it count until 4
		sc.close();
	
		
	
		
	}

}
