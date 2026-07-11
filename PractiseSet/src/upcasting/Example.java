package upcasting;

class SuperClass {
	void hi() {
		System.out.println("This is suuper class object ");
	}
	
}

class SubClass extends SuperClass{
	void hello() {
		System.out.println("This is sub class method");
	}
}

public class Example {
	public static void main(String[] args) {
		SuperClass s1=new SuperClass();
		s1.hi();
		
		SubClass s2=new SubClass();
		s2.hello();
		
	
		s1= s2;
		
		

		
		
	}

}
