package Logical_Programming;
/*
 * WAP to print sum of Single digit number in an array
 * 12,2,53,4,25
 */

public class Array_Example15 {
	static void SumOfSingleDigit(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<9) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {12,2,53,4,25};
		SumOfSingleDigit(arr);
	}

}
