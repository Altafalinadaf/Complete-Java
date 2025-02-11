package SingleDigit;

public class Divisible4 {
      public static void main(String[] args) {
        int count=0,rem=0;
  		int num=82345;
  		while(num>0) {
  			rem=num%10;
  			if(rem%4==0) {
  				count++;
  			}
  			num/=10;
  		}
  		System.out.println(count);
  	}
}
