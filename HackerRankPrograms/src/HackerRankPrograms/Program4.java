package HackerRankPrograms;
/*
 * input : 
 * Hello world
   I am a file
   Read me until end-of-file.
   
   output:
   1 Hello world
   2 I am a file
   3 Read me until end-of-file.
   
   
    Scanner scanner = new Scanner(System.in);
		 String[] strings=new String[3];
		 for(int i=0;i<3;i++) {
			 strings[i]=scanner.nextLine();
		 }
		 for(int i=0;i<3;i++) {
			 System.out.println(1+i+" "+strings[i]);
		 } 
  
 */

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int lineNumber = 1;

	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            System.out.println(lineNumber + " " + line);
	            lineNumber++;
	        }	
	        scanner.close();
		
	}

}
