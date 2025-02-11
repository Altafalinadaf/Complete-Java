package Logical_Programming;
// 0,1,2,3,4
// 1,2,3,4,5
// output =20

public class Array_Example12 {
	static void sumOfOdd(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			if(i%2!=0) {
				sum=sum+(arr[i]*arr[i]);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfOdd(arr);
	}

}
