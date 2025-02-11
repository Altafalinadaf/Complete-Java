package PractiseSet;

// non static to non static and non static to static

public class Practise1 {
	int x=10;
	
	
	void disp() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Practise1().disp();
		System.out.println(new Practise1().x);
	}

}
