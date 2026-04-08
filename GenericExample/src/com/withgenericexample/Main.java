package com.withgenericexample;
public class Main {
	public static void main(String[] args) {
		
		Box<Integer> box=new Box<>();
		
//		now the below line will become compile time error because i used generic type so we can store only int type value
//		box.setValue("abc");
		
		box.setValue(3);
//		no manual type casting needed for generic,type safety
		Integer value = box.getValue();
		System.out.println(value);
		
		
		
	}

}
