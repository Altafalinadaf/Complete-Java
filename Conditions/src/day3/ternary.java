package day3;

// ternary operator is also called as short hand operation

public class ternary {
	public static void main(String args[]) {
		int a=5;
		int b=10;
		int max;
		max=(a>b)?a:b; // ternary operator instead of if,else, we can use this condition for short hand
		System.out.println(max);
		max=(a<b)?a:b;  
		System.out.println(max);
	}

}
