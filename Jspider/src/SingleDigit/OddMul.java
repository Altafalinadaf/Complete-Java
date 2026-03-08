package SingleDigit;

public class OddMul {
	public static void main(String[] args) {
	      
	   	  int mul=1,rem=0;
	 		int num=123456;
	 		while(num>0) {
	 			rem=num%10;
	 			if(rem%2==1) {
	 				mul=mul*rem;
	 			}
	 			num/=10;
	 		}
	 		System.out.println(mul);
	 	}


}
