package Data_Structure_Analysis;
// Traversal 
// it traverse each array 

public class Array_Traversal {
	public static void display(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
			
		}
	
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,12,45,78};
		display(arr, 8);
	}

}
