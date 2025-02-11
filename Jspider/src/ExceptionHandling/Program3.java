package ExceptionHandling;
@SuppressWarnings("serial")
class NumberException extends Exception{
	String message;
	public NumberException(String message) {
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
		
	}
}

public class Program3 {
	static void numberVerification() throws NumberException{
		int num=1;
		if(num==10) {
			System.out.println("It's Corret Numeber");
		}
		else {
			throw new NumberException("You have to Enter 10 Numbers ");
		}
	}
	public static void main(String[] args) {
		try {
			numberVerification();
		} catch (NumberException e) { // NumberException e=new NumberException(); by default it created 
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
