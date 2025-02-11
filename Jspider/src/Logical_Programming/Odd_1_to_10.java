package Logical_Programming;

public class Odd_1_to_10 {
	static void odd(int start ,int end) {
		for(int i=start;i<=end;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		odd(1, 10);
	}

}
