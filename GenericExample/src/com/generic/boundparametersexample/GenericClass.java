package com.generic.boundparametersexample;

public class GenericClass extends Number implements Printable{
	
	private final int value;
	
	@Override
	public void print(){
		// TODO Auto-generated method stub
		System.out.println("value = "+value);
		
	}
	
	public GenericClass(int value) {
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return value;
	}
	

}
