package Inheritence;

class Sample2{
	int x=10;
}
class Demo2 extends Sample2{
	void disp() {
		System.out.println("disp");
	}
}
class Tester2 extends Sample2{
	void cool() {
		System.out.println("its cool");
	}
}
class Tester3 extends Sample2{
	void good() {
		System.out.println("I'm good");
	}
}

public class HeirarchicalInheritence {
	public static void main(String[] args) {
		
		System.out.println("Demo2");
		Demo2 objDemo2 = new Demo2();
		System.out.println(objDemo2.x);
		objDemo2.disp();
		System.out.println("Tester");
		Tester2 obj1=new Tester2();
		System.out.println(obj1.x);
		obj1.cool();
		Tester3 obj2=new Tester3();
		System.out.println(obj2.x);
		obj2.good();
		
	}

}
