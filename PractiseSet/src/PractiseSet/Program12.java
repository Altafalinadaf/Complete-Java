package PractiseSet;

public class Program12 {
	public static void main(String[] args) {
		int sum=0;
		int res=0;
		int[] arr= {2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		//System.out.println(sum);
		
		while(sum>9) {
		
			while(sum>0) {
				int rem=sum%10;
				
				res=res+rem*rem;
			//	System.out.println(res);
				sum/=10;
			}
			sum=res;
			//System.out.println(sum);
	    }
		
		if(sum==1 || sum==7) {
			System.out.println("happy number ");
		}
		else {
			System.out.println("not happy number ");
		}
	
	}

}
