package SingleDigit;
// 82345
// 12
public class Sum4DivNumber {
	public static void main(String[] args) {      
	   	  int sum=0,rem=0;
	 		int num=82345;
	 		while(num>0) {
	 			rem=num%10;
	 			if(rem%4==0) {
	 				sum=sum+rem;
	 			}
	 			num/=10;
	 		}
	 		System.out.println(sum);
	 	}


}
