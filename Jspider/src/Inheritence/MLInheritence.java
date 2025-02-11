package Inheritence;

class Sample1{
	int x=10;
}

class Demo1 extends Sample1{
	void cool() {
		System.out.println("I am Cool");
	
	}
}
class Tester1 extends Demo1{
	void disp(){
		System.out.println("Hi i am disp");
	}
}
public class MLInheritence {
	public static void main(String[] args) {
		Tester1 obj = new Tester1();
		System.out.println(obj.x);
		obj.cool();
		obj.disp();
	}

}
