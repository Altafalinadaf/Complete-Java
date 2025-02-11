package HackerRankPrograms;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    int num=scanner.nextInt();
	    String string =Integer.toString(num);
	    System.out.println(string);
	    
	    
	    if(string!=null) {
	    	System.out.println("Good job");
	    }
	    else {
	    	System.out.println("Wrong job");
	    }
	    scanner.close();
	}

}
