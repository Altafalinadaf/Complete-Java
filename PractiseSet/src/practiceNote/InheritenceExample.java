package practiceNote;

class ParentClass3{
	void parentProperty() {
		System.out.println("Parent Property");
	}
	
}

class ChildClass extends ParentClass3{
	void childProperty() {
		System.out.println("Child Property");
	}
	
}

public class InheritenceExample {
	public static void main(String args[]) {
		
		ChildClass obj=new ChildClass();
		obj.childProperty();
		
	}

}
