package SingleDigit;

public class Example1 {
	public static void main(String[] args) {
		int num=1234;
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
	}

}
