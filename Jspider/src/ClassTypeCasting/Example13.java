package ClassTypeCasting;
class Sample21{
	void co() {
		System.out.println("hi its coo");
	}
	int r=10;
}

class Hahoha extends Sample21{
	void disp() {
		System.out.println("hi its disp");
	}
}

public class Example13 {
	public static void main(String[] args) {
		Sample21 s1=new Hahoha();
		s1.co();
		System.out.println(s1.r);
		Hahoha h1=(Hahoha)s1;
		h1.co();
		System.out.println(h1.r);
		h1.disp();
	}

}
