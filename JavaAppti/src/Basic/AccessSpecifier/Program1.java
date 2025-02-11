package Basic.AccessSpecifier;

public class Program1 {
	static private int $; 
	public static void main(String[] args) {
		//String a_b;
	//	System.out.println(a_b); // Initialize and then utilize
		System.out.println($); // global variable can be utilize without initialize because those are having the default values
	}

}
