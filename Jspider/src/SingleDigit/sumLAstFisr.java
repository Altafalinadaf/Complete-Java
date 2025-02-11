package SingleDigit;
// wap to sum of st and last digit of given number
// 1234
// 5
public class sumLAstFisr {
	public static void main(String[] args) {
		int num=1234,num1=num/10;
		int rem=0,rem1=0;
		while(num>num1) {
			rem=num%10;
			System.out.println(rem);
			rem1=num/1000;	
			System.out.println(rem1);
			num=num1/10;
			System.out.println(rem+rem1);
		}
		
	}

}
