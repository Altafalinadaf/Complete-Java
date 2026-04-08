package com.generic.interfaceexamples;

public class Main {
	public static void main(String[] args) {
		GenericContainer<Integer> container=new GenericContainer<Integer>();
		container.add(34);
		System.out.println(container.get());
	}
}
