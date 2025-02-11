package ForLoop_Programs;

public class Printing1234554321 {
	public static void main(String[] args) {
		int n=5;
		int num;
		for(int i=1;i<=n*2;i++) {
			if(i<=5) {
				num=i;
			}
			else {
				num=n*2-i+1;
			}
			System.out.print(num+" ");
		}
	}

}
