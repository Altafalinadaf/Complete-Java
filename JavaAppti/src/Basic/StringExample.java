package Basic;

import java.util.Arrays;



public class StringExample {
	static char a='a';
	
     public static void main(String[] args) {
		char[] str= {'a','b','c'};
		String str1[]= {"Sanju","Ravi"};
		System.out.println(str.toString());// it will just print the address of the Object 
		System.out.println(Arrays.toString(str1));  // it will print the actual values in the given string
		System.out.println(Arrays.toString(str));
		System.out.println(a);
		int b='c';
		System.out.println(b);
		
		
		/*
		 * a+"" and b+"" will be converted into string, .toString() or +"" after variable or value converts value into the string
		 *  and a+b will be added because they are not converted into string. Hence output will be AB-131.
		 */
		

		char a3=0X41;
		System.out.println(a3);
//		char b=0X42;
//		System.out.print(a+"" +b);
//		System.out.print("-");
//		System.out.print(a+b);
//	
	}
}
