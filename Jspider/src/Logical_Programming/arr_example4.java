package Logical_Programming;

public class arr_example4 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr1(arr);
		
	}
	static void arr1(int[] abb) {
		int sum=0;
		for(int i=0;i<=abb.length-1;i++) {
			if(abb[i]%2==1) {
				sum=sum+abb[i];
				
				
			}
		}
		System.out.println(sum);
	}

}
