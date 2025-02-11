package ExceptionHandling;

public class Example1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			int a=1/0;
		}
		catch (ArithmeticException e) {
		
			System.out.println("Handled");
		}
	}

}
