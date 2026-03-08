package methods;

// 2.by changing the number of argument is accepted by the method

public class bychangingnumberofargument {
	int multiply(int a,int b) {                  // two arguments are passing (2 parameters)
		return a*b;
	}
	int multiply (int a,int b,int c) {          // three arguments are passing (3 parameters)
		return a*b*c;
	}
	int add(int a,int b) {
		return a+b;
	}
	public static void main(String args[]) {
		bychangingnumberofargument obj=new bychangingnumberofargument();
		int e=obj.multiply(1,2);
		int c=obj.multiply(5,1);
		int d=obj.multiply(5, 4,3);
		int ea=obj.add(8, 6);
		System.out.println(e);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ea);
		
		
	}

}
