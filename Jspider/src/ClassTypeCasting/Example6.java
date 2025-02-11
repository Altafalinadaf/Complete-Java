package ClassTypeCasting;
class Sample2{
	void coo() {
		System.out.println("hi its coo");
	}
}
class Guleylu extends Sample2{
	void disp() {
		System.out.println("hi its disp");
	}
}

public class Example6 {
	public static void main(String[] args) {
		Sample2 s1=new Guleylu();
		s1.coo();
		Guleylu g1=(Guleylu)s1;
		g1.coo();
		g1.disp();
	}

}
