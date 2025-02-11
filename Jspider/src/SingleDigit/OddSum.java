package SingleDigit;

public class OddSum {
	public static void main(String[] args) {
		int sum=0,rem=0;
		int num=13956;
		while(num>0) {
			rem=num%10;
			if(rem%2==1) {
				sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}
}
