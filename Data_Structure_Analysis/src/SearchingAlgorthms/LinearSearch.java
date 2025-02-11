package SearchingAlgorthms;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {3,2,12,4,5,6,34,1};
		int key=011;
		
		for (int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("key found at index "+i);
				return;
			}
			
		}
		System.out.println("key not found");
		
		
	}

}
