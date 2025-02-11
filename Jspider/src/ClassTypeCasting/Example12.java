package ClassTypeCasting;

class Demo10{
	double z=10;
	int r=10;
}
class Dumataka3 extends Demo10{
	int x=10;
}
public class Example12 {
	public static void main(String[] args) {
		Demo10 d2=new Dumataka3();
		System.out.println(d2.z);
		System.out.println(d2.r);
		Dumataka3 d8=(Dumataka3)d2;
		System.out.println(d8.z);
		System.out.println(d8.r);
	}

}
