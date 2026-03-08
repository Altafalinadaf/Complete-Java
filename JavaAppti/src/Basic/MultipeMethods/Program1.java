package Basic.MultipeMethods;
/*
 * We know that the static block executed first.
 *  Therefore, the post decrement value of x will be 1111 and the pre decrement value will be 1109 
 *  and the difference between the values is 2 and the same will print on the console.
 *   Note that the block after the static block will never get executed.
 */

public class Program1 {
	static int x=1111;
	
	static {
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
		x=x-- - --x; // 1111-- 1111 1111-1=1110
		             // --1110 1110-1= 1109 
		
	}
	public static void main(String[] args) {
		System.out.println(x);
	}

}
