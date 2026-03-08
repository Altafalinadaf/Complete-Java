package Logical_Programming;

public class arr_example2 {
	static void arr(int[] abb) {
		for(int i=0;i<=abb.length-1;i++) {
			if(abb[i]%2==0) {
				System.out.println(abb[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr(arr);
	}

}
