package Logical_Programming;

public class arr_example3 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr1(arr);
		
	}
	static void arr1(int[] abb) {
		for(int i=0;i<=abb.length-1;i++) {
			if(abb[i]%2==1) {
				System.out.println(abb[i]);
			}
		}
	}

}
