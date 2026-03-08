package objectExample;

class A extends Object{
	void hi() {
		System.out.println("Hi from A");
	}
	@Override
	public String toString() {
		return "HiHI";
	}
	
	@Override
	public int hashCode() {
		return 123;
	}
}

public class Example1 {
	public static void main(String[] args) {
		A a = new A();
		a.hi();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
	}

}
