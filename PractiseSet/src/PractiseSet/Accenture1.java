package PractiseSet;

public class Accenture1 {
	public static void main(String[] args) {
		int[] arr= {3,8,14,12,10,7,4};
		int sum=0;
		int sum1=0;
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int mid=(left+right)/2;
			for(int i=0;i<mid;i++) {
				sum=sum+arr[i];
				
			}
			
			
			for(int j=mid-1;j<right+1;j++) {
				sum1=sum1+arr[j];
			}
			break;
			
		}
		System.out.println(sum*sum1);
		
	}

}
