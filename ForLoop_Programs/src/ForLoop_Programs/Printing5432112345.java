package ForLoop_Programs;

public class Printing5432112345 {
	public static void main(String[] args) {
		int n=5;
		int num;
		for(int i=n*2;i>=1;i--) {
			if(i>n) {
				num=i-5;
			}
			else {
				num=n*2-i-4;
			}
			System.out.print(num+" ");
		}
	}

}
