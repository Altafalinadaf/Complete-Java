package Logical_Programming;

public class arr_example8 {
	static void sumOfSquare(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+(arr[i]*arr[i]);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfSquare(arr);
	}
	

}
