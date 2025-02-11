package Logical_ProgrammingSecondDay;

public class LastSumOfOdd {
	static int findFac(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
			
		}
		return fac;
	}
	
	
    int findSumOfArray(int[] arr) {
		int sum=0;
		for(int i=arr.length-1;i>=0;) { // i-- no because we are not decrementing anything last value is odd 
			if(arr[i]%2==1) {
				sum=sum+findFac(arr[i]);
				break;
			}
			
			
		}
		return sum;
	}
	public static void main(String[] args) {
		LastSumOfOdd objLastSumOfOdd=new LastSumOfOdd();
		
		int[] arr= {1,23,3,4,5,8,1};
		System.out.println(objLastSumOfOdd.findSumOfArray(arr));
	}


}
