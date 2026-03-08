package Inheritence;

class Sample4{
	int x=10;
}
class Demo4 extends Sample4{
	void Foo() {
		System.out.println("hi its me foo");
	}
}

class Tester4 extends Sample4{
	void disp() {
		System.out.println("Hi it's display");
	}
}
class Cool4 extends Demo4 {
	void Chu() {
		System.out.println("hi it's Chu ");
	}
}
public class Hybrid_Inheritence {
	public static void main(String[] args) {
		Cool4 objCool4=new Cool4();
		System.out.println(objCool4.x);
		objCool4.Chu();
		objCool4.Foo();
		Tester4 objTester4=new Tester4();
		objTester4.disp();
		
		
		
		
	}

}
