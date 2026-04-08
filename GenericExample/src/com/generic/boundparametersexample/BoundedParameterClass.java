package com.generic.boundparametersexample;

// T extends Number & Printable interface, first class should come after any numner of interfaces
// T extends Printable - only need to use extends keyword for bounding

public class BoundedParameterClass<T extends Number & Printable> {
	private T item;
	
	public BoundedParameterClass(T item) {
		// TODO Auto-generated constructor stub
		this.item=item;
	}
	
	public void display() {
		item.print();
	}
	
	public T getItem() {
		return item;
	}
}
