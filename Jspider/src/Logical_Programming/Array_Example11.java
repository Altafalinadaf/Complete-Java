package Logical_Programming;
// 0,1,2,3,4
// 1,2,3,4,5

public class Array_Example11 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfEvenPostion(arr);
		
	}
	static void sumOfEvenPostion(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				sum=sum+(arr[i]*arr[i]);
			}
		}
		System.out.println(sum);
	}
	

}
