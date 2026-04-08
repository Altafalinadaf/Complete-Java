package com.withgenericexample;

// T is the place holder 
// <> - called diamond
// <T> generic type
public class Box<T>{
	
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;	
	}
	
	
	

}
