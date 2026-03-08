package SingleDigit;
//123456
// 9
public class SumOddNumber {
	public static void main(String[] args) {
		int num=123456;
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			if(rem%2==1) {
				sum=sum+rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}

}
