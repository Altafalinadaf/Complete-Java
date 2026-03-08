package Abstraction;

abstract class Sample{
	abstract void add();
	abstract void sub();
	
}

abstract class Sample2 extends Sample{
    void add() {
		System.out.println("Hi i am fine");
	}
	
	
}

public class AbstractExample2  extends Sample2{
	void sub() {
		System.out.println("hi it s mine");
	}
	
	public static void main(String[] args) {
		AbstractExample2 objExample2=new AbstractExample2();
		objExample2.add();
		objExample2.sub();
		
	}
	

}
