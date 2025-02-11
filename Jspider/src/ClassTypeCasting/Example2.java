package ClassTypeCasting;
class Sample{
	void disp() {
		System.out.println("it's disp");
	}
}
class Ampules extends Sample{
	void tata() {
		System.out.println("hi tata");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Sample s1=new Ampules();
		Ampules a1=(Ampules)s1;
		s1.disp();
		a1.disp();
		a1.tata();
	}

}
