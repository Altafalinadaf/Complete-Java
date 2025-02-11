package methods;

public class Methods_Example {
	// by changing the the return type we can create same name method 
	static void add() {
		int a=10;
		int b=10;
		System.out.println(a+b);
		
	}
	// by changing the parameter we can create the method with the same name
	static int add(int c) {
		int a=10;
		int b=20;
		System.out.println(a+b);
		return 0;
	}
	// by changing the parameter we can create the method with the same name
	static int add(int a,int x) {
		a=12;
		x=10;
		System.out.println(a);
		return 0;
		
	}
	// by changing the the return type we can create same name method 
	static double add(double a) {
		a=10;
		System.out.println(a);
		return 0;
	}
	
	static int example(int a,double b) {
		double c= a+b;
		System.out.println(c);
		return 0;
	}
	public static void main(String[] args) {
		add();
		add(0);
		add(0, 0);
	    add(0.0);
	    example(1, 2);
	}

}
