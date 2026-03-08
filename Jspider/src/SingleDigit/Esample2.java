package SingleDigit;

public class Esample2 {
	static void add(int n) {
		int rem=0,sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(1234);
	}

}
