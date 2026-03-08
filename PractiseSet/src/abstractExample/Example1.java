package abstractExample;

abstract class A{
	void hello() {
		System.out.println("Hello from class A");
	}
	
	abstract void hi();
}

class B extends A{
	void hi() {
		System.out.println("hi from class B");
	}
	
}

class C extends A{
	void hi() {
		System.out.println("hi from class c");
	}
}


public class Example1 {
	public static void main(String[] args) {
		B b=new B();
		b.hi();
		b.hello();
		
		C c =new C();
		c.hi();
		c.hello();
	}
	

}
