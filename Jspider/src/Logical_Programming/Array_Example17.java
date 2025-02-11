package Logical_Programming;

/* WAP sum of double digit odd number in an array
 * 11 2 53 4 25
 */

public class Array_Example17 {
	static int sumOfOddDigit(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>9) {
				if(arr[i]%2!=0) {
				 sum=sum+arr[i];
				}
			}	
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int []arr= {11,2,53,4,25};
		System.out.println(sumOfOddDigit(arr));
	}

}
