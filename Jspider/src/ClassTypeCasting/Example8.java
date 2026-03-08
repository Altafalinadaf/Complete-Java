package ClassTypeCasting;
class Tester1{
	int x=10;
	void disp() {
		System.out.println("hi its disp");
	}
}
class Huliyacha extends Tester1{
	void ho() {
		System.out.println("hi ho");
	}
}
public class Example8 {
	public static void main(String[] args) {
		Tester1 t2=new Huliyacha();
		System.out.println(t2.x);
		t2.disp();
		Huliyacha h2=(Huliyacha)t2;
		System.out.println(h2.x);
		h2.disp();
		h2.ho();
		
	}

}
