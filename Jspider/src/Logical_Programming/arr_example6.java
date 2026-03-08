 package Logical_Programming;

public class arr_example6 {
	static void add(int[] arr) {
		int sum=0;
		for(int element:arr) {
		     sum+=element;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		add(arr);
	}

}
