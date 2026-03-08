package ForLoop_Programs;

public class Printing1234512345 {
	public static void main(String[] args) {
		int n=5;
		int num;
		for(int i=n*2;i>=1;i--) {
			if(i>n) {
				num=n*2-i+1;
			}
			else {
				num=n*2-i-4;
			}
			System.out.print(num+" ");
		}
	}

}
