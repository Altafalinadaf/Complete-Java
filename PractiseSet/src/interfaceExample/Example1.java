package interfaceExample;

abstract interface A{
	
//	by default all the variable public static final 
	public static final int a = 10;
	int c =20;
//	by default all the methods public abstract
	public abstract void hello();
	void hi();
}

class B implements A{
	B(){
		System.out.println("B constructor");
	}
	public void hi() {
		System.out.println("Hi");
	}
	public void hello() {
		System.out.println("Hello");
	}
}
public class Example1 {
	public static void main(String[] args) {
		
		System.out.println(A.c);
		System.out.println(A.a);
		B b=new B();
		b.hello();
		A a =new B();
		a.hi();
	}
}
