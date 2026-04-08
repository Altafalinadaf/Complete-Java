package com.generic.interfaceexamples;

public class GenericContainer<T> implements Container<T>{

	private T item;
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		this.item=item;
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return item;
	}



}
