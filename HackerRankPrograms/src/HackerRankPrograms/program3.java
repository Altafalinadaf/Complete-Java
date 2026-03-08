package HackerRankPrograms;

import java.util.Scanner;

/*input: 
 * 42
3.1415
Welcome to HackerRank's Java tutorials!
 * o/p:
 * String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */

public class program3 {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        int i = scan.nextInt();
	       
	        double d = scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	        
	        // consume the remaining newline character
	        scan.close();
	        
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	 }



}
