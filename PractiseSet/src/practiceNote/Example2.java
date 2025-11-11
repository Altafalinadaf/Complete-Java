package practiceNote;

class Parent{
	void property() {
		System.out.println("Parent property");
	}
}

class Child2 extends Parent{
	void childProperty() {
		System.out.println("Child property");
	}
}
public class Example2 {
	public static void main(String[] args) {
		
		Child2 refChild2 = new Child2();
		refChild2.childProperty();
		refChild2.property();
	}
	
	

}
