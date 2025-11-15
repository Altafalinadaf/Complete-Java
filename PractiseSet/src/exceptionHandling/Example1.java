package exceptionHandling;

class A{
	void disp3() {
		System.out.println(10/0);
	}
	void disp2() {
		disp3();
	}
	
	void disp1() {
		disp2();
	}
}

public class Example1 {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.disp1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
