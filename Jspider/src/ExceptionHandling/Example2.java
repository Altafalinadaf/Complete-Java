package ExceptionHandling;

public class Example2 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a;
		try {
			a=1/0;
			
		}
		catch (ArithmeticException e) {
		
			int arr[]= {1,23,4,43,5};
			try {
				System.out.println(arr[9]);
			} catch (ArrayIndexOutOfBoundsException e2) {
				// TODO: handle exception
				System.out.println("Handled");
			}
		}
	}

}
