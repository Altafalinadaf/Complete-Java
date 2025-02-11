package Logical_ProgrammingSecondDay;

public class SumOfReverseArray {
	static int findFac(int n) {
		int fac=1;
		for(int i=n;i>=1;i--) {
			fac*=i;
			
		}
		return fac;
	}
	
	
	static int findSumOfArray(int[] arr) {
		int sum=0;
		for(int i=arr.length-1;i>0;i--) {
			sum=sum+findFac(arr[i]);
			System.out.println(arr[i]+"="+findFac(arr[i]));
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		System.out.println("total sum = "+findSumOfArray(arr));
	}

}
