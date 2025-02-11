package programs;

public class back_patternprinting_using_recursion {
	static int backpattern_recursion(int n) {
	    if(n>0) {
			for (int i=0;i<n;i++) {
				System.out.print("* ");
			}
			System.out.println();
			backpattern_recursion(n-1);
			
		}
	    return 0;
		
		
	}
	public static void main(String args[]) {
		backpattern_recursion(4);
	}

}
