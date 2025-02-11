package ClassTypeCasting;
class cool{
	void add() {
		System.out.println("hi its add");
	}
}

class Goolata extends cool{
	void dispu() {
		System.out.println("hi its dispu");
	}
}
public class Example4 {
	public static void main(String[] args) {
		cool c1=new Goolata();
		c1.add();
		Goolata g1=(Goolata)c1;
		g1.add();
		g1.dispu();
	}

}
