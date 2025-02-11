package Logical_ProgrammingSecondDay;

public class FirstEvenNumber {
	static int findFac(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
			
		}
		return fac;
	}
	
	
	static int findSumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+findFac(arr[i]);
				break;
			}
			
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,21,3,4,5,9,6};
		System.out.println(findSumOfArray(arr));
	}

}
