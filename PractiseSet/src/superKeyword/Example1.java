package superKeyword;

class B{
	int age = 34;
}
public class Example1 extends B {
	int age = 30;
	
	void show() {
//		this() keyword will refers to the current object 
		System.out.println(this.age);
//		super() keyword will refer to the super object 
		System.out.println(super.age);
	}
	public static void main(String[] args) {
		Example1 example1=new Example1();
		example1.show();
		
	}

}
