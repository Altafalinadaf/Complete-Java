package abstractExample;

abstract class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}


	abstract void hello();
	void hi() {
		System.out.println("This is hi from Parent");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("This in child Constructor");
	}
	@Override
	void hello() {
		System.out.println("Implemented");
	}
}
public class ConstructorExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.hi();
		child.hello();
	}

}
