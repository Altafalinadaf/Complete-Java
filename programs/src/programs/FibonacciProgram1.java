package programs;
// its a basic fibonacci program 

public class FibonacciProgram1 {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
//  	System.out.print(fib1+" "+fib2+" ");
		for(int i=1;i<6;i++) {
			fib3=fib1+fib2;
//			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
		System.out.print(fib3+" ");
	}


}
