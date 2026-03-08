package Logical_Programming;

public class Odd_10_to_1 {

	static void odd(int start ,int end) {
		for(int i=start;i>=end;i--) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		odd(10, 1);
	}
}
