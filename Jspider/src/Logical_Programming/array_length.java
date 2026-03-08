package Logical_Programming;

public class array_length {
	static void arr1(int[] abb) {
		for(int i=abb.length-1;i>=0;i--) {
			System.out.println(abb[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr1(arr);
	}

}
