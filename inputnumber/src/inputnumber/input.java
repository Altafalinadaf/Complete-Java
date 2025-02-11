package inputnumber;


import java.util.Scanner;
public class input {
	public static void main(String args[]) {
		System.out.println("Enter input number:");
		Scanner sc = new Scanner(System.in); // taking input 
		int a=sc.nextInt(); // similarly as int,double etc.....
		System.out.println("the value of a is :"+a);
		
		
		
		System.out.println("Enter float number:");
		Scanner sc1 = new Scanner(System.in); // taking input 
		float b=sc1.nextFloat(); // similarly as int,double etc.....
		System.out.println("the value of b inside is :"+b);
		
		
		
		System.out.println("Enter string number,character:");
		Scanner sc2 = new Scanner(System.in); // taking input 
		String c=sc2.next(); // similarly as int,double etc.....
		// sc2.next in used to take the only first word at a time after space it can't take other words
		System.out.println("the value of c inside is :"+c);
		
		
		
		
		System.out.println("Enter boolean value:");
		Scanner sc3 = new Scanner(System.in); // taking input 
		boolean d=sc3.nextBoolean(); // taking value as true or false only 
		System.out.println("the value of d inside is :"+d);
		
		
		System.out.println("Enter integer number:");
		Scanner sc5 = new Scanner(System.in); // taking input 
		boolean e=sc5.hasNextInt(); // if the value is integer it print 'true' else 'false'...
		System.out.println(e);
		sc.close();
		sc1.close();
		sc2.close();
		sc3.close();
		sc5.close();
	}

}
