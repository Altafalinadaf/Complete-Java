package exceptionHandling;

import java.util.Scanner;

class ShadiException extends Exception{
	String msg;
	public ShadiException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg; 
	}
	
	public String getMessage() {
		return msg;
	}
}



public class Example2 {
	void getVerication() throws ShadiException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scanner.nextInt();
		if (age>24) {
			System.out.println("You can marriage ");
		}
		else {
			throw new ShadiException("Invalid age");
		}
	}
	
	public static void main(String[] args) {
		Example2 example2= new Example2();
		try {
			example2.getVerication();
		} catch (ShadiException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			int a [] = {1,2,3};
			System.out.println(a[9]);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
