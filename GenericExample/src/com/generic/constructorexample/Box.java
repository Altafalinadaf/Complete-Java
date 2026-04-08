package com.generic.constructorexample;

public class Box {
	
//  generic type constructor 
//	generic type constructor not type safety we can pass any type parameter 
	<T>Box(T item) {	
		System.out.println(item);
	}

}
