package exceptionHandling;

public class Example3 {
	void risky() throws ArithmeticException{
		throw new ArithmeticException("Divide by zero");
	}
	public static void main(String[] args){
		
		Example3 example3=new Example3();
		example3.risky();
	}

}
