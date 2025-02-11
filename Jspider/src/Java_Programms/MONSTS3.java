package Java_Programms;

public class MONSTS3 {
	void mul(int a) {
		System.out.println(a*10);
		System.out.println("**********************************************");
	}
	void mul(int a,int b) {
		System.out.println(a*b);
		System.out.println("**********************************************");
	}
	void mul(int a,int b,int c) {
		System.out.println(a*b*c);
		System.out.println("**********************************************");
		
	}
	 void mul(int a,double b) {
		System.out.println(a*b);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		MONSTS3 obj=new MONSTS3();
		obj.mul(10);
		obj.mul(10,12);
		obj.mul(10,20,30);
		obj.mul(12,12.4);
	}

}
