package ExceptionHandling;
@SuppressWarnings("serial")
class ShadiException extends Exception{
	String message;
	ShadiException(String  message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}

public class Program1 {
	static void ageVerification() throws ShadiException{
		int age=18;
		if(age>=21) {
			System.out.println("Happy marriage life");
		}
		else {
			throw new ShadiException("Invalid age");
		}
	}
	public static void main(String[] args) {
		try {
			ageVerification();
		}
		catch (ShadiException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
