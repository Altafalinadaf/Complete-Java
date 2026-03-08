package ClassTypeCasting;
class Cool2{
	void disp() {
		System.out.println("hi its disp");
	}
}
class Dinga extends Cool2{
	int x=10;
	void tata() {
		System.out.println("Hi its tata");
	}
}
public class Example9 {
	public static void main(String[] args) {
		Cool2 c1=new Dinga();
		c1.disp();
		Dinga d1=(Dinga)c1;
		System.out.println(d1.x);
		d1.disp();
		d1.tata();

	}
}
