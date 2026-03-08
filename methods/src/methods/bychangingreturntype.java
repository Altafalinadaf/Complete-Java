package methods;
// by changing the return data type of the different method we can create a method

public class bychangingreturntype {
	static int multiply(int a,int b) {              // used int data type
		return a*b;
	}
	
	static double multiply(double a,double b) {     // used double data type   
		return a*b;
	}
	public static void main(String args[]) {
		int c=multiply(4, 4);
		double d=multiply(4, 3);
		int e=multiply(1,2);
		System.out.println("Multiple method: return integer: "+c);
		System.out.println("Multiply method: return double: "+d);
		System.out.println(e);
	}

}
