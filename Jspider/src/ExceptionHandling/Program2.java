package ExceptionHandling;


public class Program2 {
	static int divideNumber(int dividend,int divisor) throws Exception{
		if(divisor==0) {
			throw new ArithmeticException("Invalid Operation ");
		}
		
		return dividend/divisor;
	}
	public static void main(String[] args) {
		try {
			int res=divideNumber(5,0);
			System.out.println(res);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error "+e.getMessage());
		}
	}
}
