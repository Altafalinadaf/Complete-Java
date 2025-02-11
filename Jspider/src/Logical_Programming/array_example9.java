package Logical_Programming;

public class array_example9 {
	static void cube(int[] arr) {
		int cube=0;
		for(int i=0;i<arr.length-1;i++) {
			cube=cube+(arr[i]*arr[i]*arr[i]);
			System.out.println(arr[i]+" "+cube);
		}
		System.out.println("total cube = "+cube);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		cube(arr);
	}

}
