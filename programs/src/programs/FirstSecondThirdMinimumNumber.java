package programs;

public class FirstSecondThirdMinimumNumber {
	public static void main(String[] args) {
		int[] arr= {2,3,4,52,5,3,2,1,5,34,54,0};
		
		int fm=Integer.MAX_VALUE;
		int sm=Integer.MAX_VALUE;
		int tm=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<fm) {
				tm=sm;
				sm=fm;
				fm=arr[i];
			}
			else if(arr[i]<sm) {
				tm=sm; 
				sm=arr[i];
			}
			else if(arr[i]>tm) {
				tm=arr[i];
			}
		}
		System.out.println("First Minimum "+fm+"\nSecond Minimum "+sm+"\nThird Minimum "+sm);
	}


}
