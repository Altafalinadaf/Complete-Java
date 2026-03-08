package SwapNumber;

public class WithoutThirdVariable {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		a=a+b;// 30
		b=a-b;// 20
		System.out.println("b = "+b);
		a=a-b; // 30 = 30-20;
		System.out.println("a = "+a);
	}

}
