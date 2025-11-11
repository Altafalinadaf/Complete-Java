package upcasting;

class A2{
	void a() {
		System.out.println("Class A");
	}
}

class B2 extends A2{
	void b() {
		System.out.println("Class B");
	}
}

public class Example3 {
//	2 ways for upcasting 
//	1. Implicit upcasting
//	2. Explicit upcasting (optional, redundant)
	
	public static void main(String[] args) {
//		1. Implicit upcasting
		A2 a=new B2();
		A2 a1=(A2) new B2();
		System.out.println("Helo");
		
		a.a();
		a1.a();
		
//		2. Explicit upcasting (optional, redundant)
		B2 b2=(B2)a1;
		b2.a();
		b2.b();
		
	}
}
