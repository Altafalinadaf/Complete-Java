package programs;

public class fibinacinumber {
	static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		/*if (n==1 || n==2) {
			return n-1;
			
		*/}
	
	    
		else {
			return fib(n-1)+ fib(n-2);
		}
	}
	public static void main(String args[]) {
		int result=fib(3);
		System.out.println(result);
		
		// fibonacci series 0 1 1 2 3 5 8 13 21 34 
		// add first 2 number the next 2 number 
		// 01 1 11 2 12 3
	}

}
