package JavaImportantPrograms;

import java.util.Scanner;

// Reversing String Without Using The Third Variable 
// 1. we have to convert String to Char Type 
// 2. Then we have to Reverse the String by converting the String to char then reverse the String 

public class ReverseStringWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String Name : ");
		String s1=scanner.nextLine();
//		char[] s2=s1.toCharArray();   // Converting the String to Char Array 
//		for(int i=s2.length-1;i>=0;i--) { // Reversing the Character by using the for loop 
//			System.out.print(s2[i]);
//		}
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		scanner.close();
	}

}
