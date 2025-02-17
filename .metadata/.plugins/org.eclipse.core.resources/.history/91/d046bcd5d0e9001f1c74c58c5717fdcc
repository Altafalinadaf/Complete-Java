package programs;

import java.util.Scanner;
/*
The program prompts the user to enter the pattern number: Enter the pattern number : .

We input 4 and press Enter.

The pattern method is called with n = 4.

The outer for loop runs for i = 1 to 4 (inclusive).

In the first iteration, i = 1.
The inner for loop runs for j = 0 to 4 - 1 + 1 = 4.
It prints * (star followed by a space) in each iteration.
So, it prints * * * * in the first row.
After the inner loop completes, it moves to the next line by using System.out.println().
In the second iteration, i = 2.
The inner for loop runs for j = 0 to 4 - 2 + 1 = 3.
It prints * in each iteration.
So, it prints * * * in the second row.
After the inner loop completes, it moves to the next line.
In the third iteration, i = 3.
The inner for loop runs for j = 0 to 4 - 3 + 1 = 2.
It prints * in each iteration.
So, it prints * * in the third row.
After the inner loop completes, it moves to the next line.
In the fourth and final iteration, i = 4.
The inner for loop runs for j = 0 to 4 - 4 + 1 = 1.
It prints * in each iteration.
So, it prints * in the fourth row.
After the inner loop completes, it moves to the next line.
After the outer loop completes, the pattern printing is finished.

The final pattern printed for n = 4 is:
*/


public class backprintingpattern {
	static void pattern(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=0;j<n-i+1;j++) {
		
				System.out.print("* ");
			}
			System.out.println();	
		}
		
	}
    public static void main(String args[]){		
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter the pattern number : ");
		int n=sc.nextInt();
		pattern(n);
	}
	}
    
    
    // back printing Stars 
    /*
     * int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scanner.nextInt();
		while(num>0) {
		    for(i=1;i<=num;i++) {
			      System.out.print("* ");
		    }
		System.out.println();
		num--;
		}
     */
	

}
