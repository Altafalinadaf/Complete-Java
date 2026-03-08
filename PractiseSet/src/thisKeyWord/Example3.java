package thisKeyWord;

class A2{
	int a=20;
	A2(){
		System.out.println("Hello");
	}
}

class B extends A2{
	int a =30;
	B(){
		System.out.println("Bye");
	}
	
	
}
public class Example3 extends B{
	
	public Example3() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println(super.a);
		System.out.println("Main contruct");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main class");
		Example3 example3=new Example3();
	
		
	}

}
