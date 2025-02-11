package Logical_Programming;
// 0,1,2,3,4
// 1,2,3,4,5


public class array_example10 {
	static void sumOfEven(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			}
			
		}
		//System.out.println(sum);
		//return sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
	
		sumOfEven(arr);
		//sum=sum+sumOfEven(arr);
	}

}
