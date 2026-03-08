package Programming;

public class Example3 {
	public  String toString() { // can't to static 
		System.out.println("Test toString called");
		return "";
	}
	
	public static void main(String[] args) {
		Example3 s1=new Example3();
		System.out.println(s1.toString());
	}

}
