package programs;

import java.util.Scanner;

public class Check_Letter_Is_Capital_Small_Digit_or_Special {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character :  ");
		char ch=sc.next().charAt(0);
		sc.close();
		if(ch>='A' && ch<='Z') {
			System.out.println("Capital Letters ");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Small Letters");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It's Digit");
			
		}
		else {
			System.out.println("Speacial Letter");
		}
		
	}

}
