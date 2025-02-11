package HackerRankPrograms;

import java.util.Scanner;

public class PolindromeStr {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String revString="";
		
		for(int i=0;i<string.length();i++) {
			revString=string.charAt(i)+revString;
		}
		System.out.println(revString);
		System.out.println(string);
		 if(string.equals(revString)){
	            System.out.println("Yes");
	        }
	     else{
	            System.out.println("No");
	     }
		 scanner.close();
	}

}
