package practiceNote;


public class PassByValueAndRef {
	int a = 10;
	int b = 20;
	
	static void add(int a,int b,PassByValueAndRef ref) {
		System.out.println(a+b);
		System.out.println(ref.a+ref.b);
		
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		PassByValueAndRef ref = new PassByValueAndRef();
		add(20, 30,ref);
		
		
	}

}
