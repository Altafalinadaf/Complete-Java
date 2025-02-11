package TypeCasting;
/*
 * Enter the String : 
Hello
Enter the numeber to add : 
4
Lipps
 */

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String string=scanner.nextLine();
		System.out.println("Enter the numeber to add : ");
		int n=scanner.nextInt();
		charPrinting(string,n);
		scanner.close();
	}
	
	static void charPrinting(String a,int b) {
		for(int i=0;i<=a.length()-1;i++) {
			 char ch=(char) (a.charAt(i)+b);
			 System.out.print(ch);
		}
	}

}
