package programs;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String Name : ");
		String nameString=scanner.nextLine();
		
		String reverrString="";
		
		for(int i=0;i<nameString.length();i++) {
			reverrString=nameString.charAt(i)+reverrString;
			System.out.print(reverrString+" ");
		}
		System.out.println();
		
		System.out.println("The reverse String is : "+reverrString);
        scanner.close();
	}

}
