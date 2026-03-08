package Logical_Programming;
// 0,1,2,3,4
// 1,2,3,4,5
public class Array_Example14 {
	static void sumOfCube(int[] arr) {
		int cube=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				cube=cube+(arr[i]*arr[i]*arr[i]);
			}
		}
		System.out.println(cube);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfCube(arr);
	}

}
