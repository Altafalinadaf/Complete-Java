package ClassTypeCasting;
class Tester3{
	int r=10;
	void disp() {
		System.out.println("hi its disp");
	}
}
class Tista1 extends Tester3{
	void uliya() {
		System.out.println("hi its uliya");
	}
}
public class Example10 {
	public static void main(String[] args) {
		Tester3 t4=new Tista1(); // up casting
		System.out.println(t4.r);
		t4.disp();
		Tista1 t5=(Tista1)t4; // down casting 
		System.out.println(t5.r);
		t5.disp();
		t5.uliya();	
	}
}
