package PractiseSet;
class Sample1{
	void disp1() {
		System.out.println("Hi its upcasting ");
	}
}
class Sample4 extends Sample1{
	void disp() {
		System.out.println("Hi its down Casting S");
	}
    void disp1() {
    	
    	System.out.println("hi");
    	super.disp1();
    }
}

public class DownTypeCasting {
	public static void main(String[] args) {
		Sample4 s1=new Sample4();
		s1.disp();
		s1.disp1();
		
	}

}
