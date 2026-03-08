package methodsarguments;

public class methodarguments1 {
	static int sum(int a,int b) {
		return a+b;
	}
	static int sum(int a,int b,int c) {
		return a+b+c;
	}
	static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static void main(String args[]) {
		System.out.println("sum of 4 and 3 is: "+sum(4, 3)); // first static method have 2 parameters
		System.out.println("sum of 4,3 and 5 is :"+sum(4, 3,5));// 2nd static have 3 parameters
		System.out.println("sum of 4,3,5 and 6 is :"+sum(4, 3,5,6));// 3rdd static have 4 parameters
	}
	

}
