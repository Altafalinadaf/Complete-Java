package Games;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_game {
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissor : ");
	     int userInput=sc.nextInt();
	     sc.close();
	     // Rock=0
	     // Paper=1
	     // Scissor=2
	     Random random=new Random();
	     int computerInput=random.nextInt(3);
	     
	     if (userInput==computerInput) {
	    	 System.out.println("Draw");
	     }
	     else if( userInput==0 && computerInput == 2 || userInput==1 && computerInput ==  0 
	    		 || userInput == 2 && computerInput == 1) {
	    	 System.out.println("You Win");
	    	 
	     }
	     else {
	    	 System.out.println("You Lose");
	     }
	     
	     if(computerInput==0) {
	    	 System.out.println("Computer Choice : Rock");
	     }
	     else if(computerInput==1) {
	    	 System.out.println("Computer Choice : Paper");
	    	 
	     }
	     else {
	    	 System.out.println("Computer choice : Scissor");
	     }
	}

}
