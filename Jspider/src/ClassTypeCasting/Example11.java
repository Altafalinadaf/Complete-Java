package ClassTypeCasting;

class Cool4{
	void add() {
		System.out.println("hi its add");
	}
}

class Goolata2 extends Cool4{
	int r=10;
	void dispu() {
		System.out.println("hi its dispu");
	}
}

public class Example11 {
	public static void main(String[] args) {
		Cool4 c6=new Goolata2(); // up casting
		c6.add();
		Goolata2 g5=(Goolata2)c6; //down stating 
		System.out.println(g5.r);
		g5.dispu();
		g5.add();
	}

}
