package SingleDigit;

public class DIvisible4sumMul {
	public static void main(String[] args) {
	      
	   	  int mul=1,rem=0;
	 		int num=82345;
	 		while(num>0) {
	 			rem=num%10;
	 			if(rem%4==0) {
	 				mul=mul*rem;
	 			}
	 			num/=10;
	 		}
	 		System.out.println(mul);
	 	}


}
