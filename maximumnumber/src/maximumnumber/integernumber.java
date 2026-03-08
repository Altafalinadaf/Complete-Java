package maximumnumber;

import java.util.Scanner;


public class integernumber {
	public static void main(String args[]) {
		int a,b,c,largest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number a:");
		a=sc.nextInt();
		
		System.out.println("enter the number b:");
		b=sc.nextInt();
		
		System.out.println("enter the number c:");
		c=sc.nextInt();
		
		if (a>b && a>c)
			largest= a;
		else if (b>a && b>c)
			largest= b;
		else
			largest=c;
		
		System.out.printf("largest amoung %d %d and %d is %d",a,b,c,largest);
		//print, println is not applicable for that so we use printf
		

		sc.close();
        
    }
}
	
		 
