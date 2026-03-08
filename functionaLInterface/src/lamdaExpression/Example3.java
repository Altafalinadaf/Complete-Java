package lamdaExpression;

interface Demo{
	void test();
}

public class Example3 {
	public static void main(String[] args) {
//		lamda expression
		Demo demo=()->System.out.println("Hello lamda Expression");
		
//		Anonymous Class
		Demo demo2=new Demo() {
			
			@Override
			public void test() {
				System.out.println("Hello from anonymous class");
				
			}
		};
		
		demo.test();
		demo2.test();
	}

}
