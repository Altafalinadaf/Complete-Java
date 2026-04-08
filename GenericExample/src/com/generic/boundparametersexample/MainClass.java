package com.generic.boundparametersexample;

public class MainClass {
	public static void main(String[] args) {
		GenericClass genericClass=new GenericClass(12);
		BoundedParameterClass<GenericClass> boundedParameterClass=new BoundedParameterClass<GenericClass>(genericClass);
		System.out.println(boundedParameterClass.getItem());
		boundedParameterClass.display();
	}

}
