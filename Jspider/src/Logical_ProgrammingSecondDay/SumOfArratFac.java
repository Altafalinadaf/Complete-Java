package Logical_ProgrammingSecondDay;

public class SumOfArratFac {
	
	static int findFac(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
			
		}
		return fac;
	}
	
	
	static void findSumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+findFac(arr[i]);
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		findSumOfArray(arr);
	}

}
