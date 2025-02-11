package ClassTypeCasting;
class Cola131{
	int f=10;
	void disp() {
		System.out.println("hi its disp");
	}
}

class chungacha12 extends Cola131{
	int d=10;
}

public class Example14 {
	public static void main(String[] args) {
		Cola131 c6=new Cola131();
		System.out.println(c6.f);
		c6.disp();
		chungacha12 c8=(chungacha12)c6;
		System.out.println(c8.f);
		c8.disp();
		System.out.println(c8.d);
	}
	

}
