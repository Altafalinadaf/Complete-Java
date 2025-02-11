package Java_Programms;

public class MO2 {
	static void add(int a) {
		System.out.println(a+10);
		System.out.println("**********************************************");
	}
	static void add(int a,int b) {
		System.out.println(a+b);
		System.out.println("**********************************************");
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
		System.out.println("**********************************************");
		
	}
	static void add(int a,double b) {
		System.out.println(a+b);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		add(10);
		add(10,12);
		add(10,20,30);
		add(12,12.4);
		
	}

}
