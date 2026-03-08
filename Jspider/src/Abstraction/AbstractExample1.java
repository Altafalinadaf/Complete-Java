package Abstraction;

// any class which is declared the keyword abstract is called as abstract class
abstract class demo1{
	// any methods which is declared the keyword abstract is called as abstract method
	abstract void disp();
	abstract void test();
}

class Sample1 extends demo1{
	// any method which is declared has both declaration and definition is called as concrete method
	void disp() {
		System.out.println("hello");
	}
	// abstract void test();
	void test() {
		System.out.println("hi");
	}
}


public class AbstractExample1 {
	public static void main(String[] args) {
		Sample1 c7=new Sample1();
		c7.disp();
		c7.test();
	}
	
}
