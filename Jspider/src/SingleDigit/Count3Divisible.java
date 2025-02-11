package SingleDigit;
//13956
//3

public class Count3Divisible {
	public static void main(String[] args) {
		int count=0,rem=0;
		int num=13956;
		while(num>0) {
			rem=num%10;
			if(rem%3==0) {
				count++;
			}
			num/=10;
		}
		System.out.println(count);
	}

}
