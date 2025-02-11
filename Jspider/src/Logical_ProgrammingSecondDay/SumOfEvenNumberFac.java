package Logical_ProgrammingSecondDay;

public class SumOfEvenNumberFac {
	static int findFac(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
			
		}
		return fac;
	}
	
	
	static int sumOfEvenArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+findFac(arr[i]);
			}
			
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(sumOfEvenArray(arr));
	}

}
