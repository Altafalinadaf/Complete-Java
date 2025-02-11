package Inheritence;

class Sample{
	int x=10;
}
class Demo extends Sample{
	void disp() {
		System.out.println("Hello");
	}
}

public class SLInheritence {

	public static void main(String[] args) {
		
		Demo objDemo = new Demo();
		System.out.println(objDemo.x);
		objDemo.disp();
		
	}
}
