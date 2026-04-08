package com.keypairvalue.genericexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairValue<String, Integer> pairValue = new PairValue<>("age",30);
		Integer value = pairValue.getValue();
		String key = pairValue.getKey();
		System.out.println(key+" = "+value);
/*
 * naming conventions
 * 
 * T- Type
 * E- Element (used in collections)
 * K - Key (used in maps)
 * V - Value (used in maps)
 * N - Number
 */
	}

}
