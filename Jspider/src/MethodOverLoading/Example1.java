package MethodOverLoading;

public class Example1 {
	
	static int add(int a,int b) {
		int res=a+b; // 7
		return add1(res);
	}
	static int add1(int a) {
		return a+10;
	}
	public static void main(String[] args) {
		System.out.println(add(3, 5));
	}

}
