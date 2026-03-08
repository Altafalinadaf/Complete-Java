package ExceptionHandling;

import java.util.Scanner;

//  Write a Java program to create a method that takes an integer as a parameter 
// and throws an exception if the number is odd.

class OddException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public OddException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
    public String getMessage() {
		return message;
	}
}
public class Program5 {
	
	static void even(int n) throws OddException{
		if(n%2==0) {
			System.out.println("Even Number ");
		}
		else {
			throw new OddException("Number is Odd");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
	
		try {
			System.out.println("Enter the number : ");
			int n=scanner.nextInt();
			even(n);
		}
		catch (OddException  e) {
			// TODO: handle exception
			System.out.println("Error "+e.getMessage());
		}
	}
}
