package com.generic.methodexample;

public class Main {
	public static void main(String[] args) {
		GenericMethod genericMethod=new GenericMethod();
//		it will call normal method
		genericMethod.display(45);
		
//		it will call generic method
		genericMethod.display("hello");
		genericMethod.display(45.6);
	}

}
