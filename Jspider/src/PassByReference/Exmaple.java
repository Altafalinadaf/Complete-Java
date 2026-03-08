package PassByReference;

public class Exmaple {
	int x=10;
	static int y=10;
//	void disp(Exmaple a) {
//		System.out.println(a.x);
//		
//	}
	void disp() {
		System.out.println(x+10);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Exmaple a=new Exmaple();
		a.disp();
	}

}
