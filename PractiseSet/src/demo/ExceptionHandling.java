package demo;

import java.util.Scanner;

class Exception2 extends Exception{
	String msgString;
	
	public Exception2(String mString) {
		// TODO Auto-generated constructor stub
		this.msgString=mString;
	}
	
	public String getMessage() {
		return msgString;
	}
}

class Check{
	public static void checkAge(int age ) throws Exception{
		if(age>24) {
			System.out.println("You can Marry");
		}
		else {
			throw new Exception2("Not Valid age");
		}
	}
}

public class ExceptionHandling {
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your age = ");
		int age= scanner.nextInt();
		try {
			Check.checkAge(age);
		}
		catch (Exception2 e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

}
