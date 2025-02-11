package SingleDigit;

// wap to sum to sum of which is divisible by 3 in given nu?  // 13956 //18

public class SumExample {
	public static void main(String[] args) {
		int sum=0,rem=0;
		int num=13956;
		while(num>0) {
			rem=num%10;
			if(rem%3==0) {
				sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}

}
