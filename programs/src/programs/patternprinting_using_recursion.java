package programs;

public class patternprinting_using_recursion {
	static void patternrec(int n) {
		if (n>0) {
			patternrec(n-1);
			//If n is greater than 0, then method makes a recursive call with n-1.
			//This is the recursive step, where the method calls itself with a smaller value of n
			for (int i=0;i<n;i++) {
				
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
	}
	public static void main(String args[]) {
		patternrec(4);
	}

}
