package ExceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a=1/2;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Handled");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught");
		}
		
		
		
		// only this block will execute 
		finally {
			System.out.println("It's finally block ");
		}
	}

}
