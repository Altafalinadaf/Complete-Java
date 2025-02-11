package AccessModifier4;

class Demo{
	static int emp_no=10;
	static double emp_id=12.3;
	
	static int add(int a ,int b) {
		return a+b;
	}
}


class Practice01 {
	public static void main(String[] args) {
		System.out.println(Demo.emp_no);
		System.out.println(Demo.emp_id);
		System.out.println(Demo.add(3,4));
	}

}
