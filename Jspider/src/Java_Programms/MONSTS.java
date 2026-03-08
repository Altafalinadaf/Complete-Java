package Java_Programms;

public class MONSTS {
	 void add(int a) {
		System.out.println(a+10);
		System.out.println("**********************************************");
	}
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println("**********************************************");
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
		System.out.println("**********************************************");
		
	}
	 void add(int a,double b) {
		System.out.println(a+b);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		MONSTS obj=new MONSTS();
		obj.add(10);
		obj.add(10,12);
		obj.add(10,20,30);
		obj.add(12,12.4);
		
	}

}
