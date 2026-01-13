package functionaLInterface;

interface Payment3{
	static void test() {
		System.out.println("We can write static method inside interface");
	}
	
	default void demo() {
		System.out.println("We can also write default method inside interface");
	}
}


//to print default method you must have to create implementation classs without implementing unless you want 
class UPI3 implements Payment3{
	
}

public class Example3 {
	public static void main(String[] args) {
		Payment3.test();
		Payment3 payment3=new UPI3();
		payment3.demo();
		
	}

}
