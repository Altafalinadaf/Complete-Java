package Basic;

public class MethodsExample {
	static byte assign(byte a) {
		a +=100;
		return a;
	}
	public static void main(String[] args) {
		byte a=10;
		byte b=10;
		b=assign(a);
		System.out.println(a+" "+b);
		
	}
	

}
