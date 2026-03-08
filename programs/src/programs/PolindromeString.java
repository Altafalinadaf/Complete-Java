package programs;

import java.util.Scanner;

public class PolindromeString {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the String name : ");
		String string=scanner.next();
		String revString="";
		
		for(int i=0;i<string.length();i++) {
			revString=string.charAt(i)+revString;
		}
		
		 if(string.equals(revString)){
	            System.out.println("Yes\nThe String is Polindrome ");
	        }
	     else{
	            System.out.println("No\nThe String is not a Polindrome ");
	     }
		 scanner.close();
		/* 
		 if(string==revString) {   // now we can't use here == operator to check the given 2 string
			 System.out.println("hi");  
		 }
		 */
	}

}
