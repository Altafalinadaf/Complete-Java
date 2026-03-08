package thisKeyWord;

class A{
	String name="abc";
	int age=24;
	
	A(String name,int age){
		this.name=name;
		this.age=age;
	}
	
//	Yes, toString() should be public because it overrides Object class's toString() method,
//	which is public. Java does not allow reducing visibility in method overriding
	public String toString() {
		return name+" "+age;
	}
	
	public int hashCode() {
		return 23;
	}

}

public class Example1 {
	public static void main(String[] args) {
		A a=new A("xyz",30);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a);
		System.out.println(a.hashCode());
	}

}
