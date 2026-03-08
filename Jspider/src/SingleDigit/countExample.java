package SingleDigit;
// wap to count even number of given no  123456
//  3
public class countExample {
	public static void main(String[] args) {
		int rem=0,count=0,num=123456;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				count++;
			}
			num/=10;
		}
		System.out.println(count);
	}

}
