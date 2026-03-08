package upcasting;

class A{
	void hi() {
		System.out.println("A class");
	}
}

class B extends A{
	void hi() {
		System.out.println("B class");
	}
}


public class Example2 {
	public static void main(String[] args) {
		A a=new B();
		a.hi();
	}

}
