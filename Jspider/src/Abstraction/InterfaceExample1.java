package Abstraction;

abstract interface Sample12{
	public abstract void add();
	public abstract void sub();
	public static final int a=10;
}

public class InterfaceExample1 implements Sample12 {
	public void add() {
		System.out.println("Hi");
		
	}
	public void sub() {
		System.out.println("Bye");
		
	}
	public static void main(String[] args) {
		InterfaceExample1 a1=new InterfaceExample1();
		a1.add();
		a1.sub();
	   System.out.println(a);
	}
	

}
