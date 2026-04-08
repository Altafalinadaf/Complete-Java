package com.generic.methodexample;

public class GenericMethod {
	
//	generic method
	
	public <T> void  display(T item) {
		System.out.println("generic method item value = "+item);
	}
	
	public void display(Integer item) {
		System.out.println("normal method item value = "+item);
	}

}
