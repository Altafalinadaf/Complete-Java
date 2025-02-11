package Abstraction;

interface test{
	void cool();
	void sub();
	
}
abstract class Sample13 implements test{
	// void sub();
	public  void  cool() {
		System.out.println("hello hfjfh");
		
	}
}


public class InterfaceExample2 extends Sample13{
	public void sub() {
		System.out.println("hello gadsfiugdskjgfdskj");
	}
	public static void main(String[] args) {
		InterfaceExample2 a2=new InterfaceExample2();
		a2.cool();
		a2.sub();
		
	}

}
