package ForLoop_Programs;

public class Odd {
	public static void main(String[] args) {
		System.out.println("Odd Number");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		System.out.println("Reverse Order ");
		for(int j=10;j>=1;j--) {
			if(j%2!=0) {
				System.out.println(j);
			}
		}
		System.out.println("21 to 31");
		for(int i=36;i<=76;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("81 to 41");
		for(int i=81;i>=41;i--) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
	}

}
