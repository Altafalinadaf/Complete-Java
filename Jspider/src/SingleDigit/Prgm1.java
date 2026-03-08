package SingleDigit;
// WAP to sum even no. of given np. ? i/p=123456 o/p=12

public class Prgm1 {
//	static void even(int[] arr) {
//		int sum=0,rem=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				while(arr[i]>0) {
//						rem=arr[i]%10;
//						sum+=rem;
//						arr[i]/=10;
//					}
//				}
//				
//			}
//		System.out.println(sum);
//	}
	
	
	static void even(int n) {
		int sum=0,rem=0;
		while(n>0) {
			rem=n%10;// 123456 6
			if(rem%2==0) {
				sum+=rem;// sum=0+6=6
			}
			n/=10;	
		}
		System.out.println(sum);
	}
    public static void main(String[] args) {
//		int[] arr={1,2,3,4,5,6};
//		even(arr);
    	even(123456);
		
	}

}
