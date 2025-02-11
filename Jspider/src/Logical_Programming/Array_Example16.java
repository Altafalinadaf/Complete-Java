package Logical_Programming;

/*
 * WAP to print sum of Double digit number in an array
 * 12,2,53,4,25
 */

public class Array_Example16 {
	public static void main(String[] args) {
		int[] arr= {12,2,53,4,25};
//		int x=sumOfDoubleDigit(arr);
//		System.out.println(x);
		// or
		System.out.println(sumOfDoubleDigit(arr));
		
	}
	
	static int sumOfDoubleDigit(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>9) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	

}
