package ClassTypeCasting;

class Demo{
	int x=10;
}
class PemoCha extends Demo{
	void ho() {
		System.out.println("Hi its ho");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Demo d1=new PemoCha(); // up casting 
		System.out.println(d1.x);
		PemoCha p1=(PemoCha)d1;  // down casting
		System.out.println(p1.x);
		p1.ho();
	}

}
