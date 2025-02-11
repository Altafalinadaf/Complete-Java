package SingleDigit;

public class FirstAndLastSum {
	public static void main(String[] args) {
	      
	   	  int mul=1,rem=0;
	 		int num=123456;
	 		while(num>0) {
	 			rem=num%10;
	 			if(rem%2==0) {
	 				mul=mul*rem;
	 			}
	 			rem=num%100;
	 			
	
	 		}
	 		System.out.println(mul);
	 	}

}
