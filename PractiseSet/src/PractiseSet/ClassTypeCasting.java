package PractiseSet;
// UpCasting 
// -converting from sub class object into super class type 
// -without is relation we can't do up casting 
// -up casting done by both implicitly and explicitly

class Sample{
	void disp() {
		System.out.println("Hi its me");
	}
}
class Sample3 extends Sample{
	void disp2() {
		System.out.println("hit its not me");
	}
}

public class ClassTypeCasting {
	public static void main(String[] args) {
		Sample s1=new Sample3();
		s1.disp();
	}

}
