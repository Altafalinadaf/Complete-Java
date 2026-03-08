package PractiseSet;

abstract interface Animal1{
	void sound(int x);
}

class dog1 implements Animal1{
     public void sound(int x) {
    	
		System.out.println("Dog sounds"+x);
	}
}
class cat1 implements Animal1{
	public void sound(int x) {
		
		System.out.println("cat sound"+x);
	}
}


public class Practise4 {
	static void disp12(Animal1 a) {
		a.sound(20);
	}
	public static void main(String[] args) {
		dog1 d1=new dog1();
		cat1 c1=new cat1();
		disp12(d1);
		disp12(c1);
	}

}
