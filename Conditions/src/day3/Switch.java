package day3;

import java.util.Scanner;

//switch statement use for printing number of option 
// it's used for menu(Content menu)
// we use break here for breaking the true condition after executing 
// there is a default in switch like in if condition there is a else statement
public class Switch {
	public static void main(String args[]) {
//		int age=25;
//		switch(age) {
//		case 10:
//			System.out.println("age is 10");
//			break;
//		case 15:
//			System.out.println("age is 15");
//			break;
//		case 20:
//			System.out.println("age is 20");
//			break; // break is used to break the condition after execute
//		case 25:
//			System.out.println("age is 25");
//			break;
//		default:
//			System.out.println("not match");
//							
//		}
//		System.out.println("done with switching");
		
		
		// switching based on user input
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age=scanner.nextInt();
		switch (age) {
		case 10: 
			
			System.out.println("the age is 10");
			break;
		case 15:
			System.out.println("the age is 15");
			break;
		case 20:
			System.out.println("the is 20");
			break;
		case 30:
			System.out.println("the age is 30");
			break;
		default:
			System.out.println("not match");
		}
		
		System.out.println("done with switching");
	
		scanner.close();
 
	}

}
