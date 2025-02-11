package Java_Programms;

public class MO3 {
	static void mul(int a) {
		System.out.println(a*10);
		System.out.println("**********************************************");
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
		System.out.println("**********************************************");
	}
	static void mul(int a,int b,int c) {
		System.out.println(a*b*c);
		System.out.println("**********************************************");
		
	}
	static void mul(int a,double b) {
		System.out.println(a*b);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		mul(10);
		mul(10,12);
		mul(10,20,30);
		mul(12,12.4);
		
	}


}
