
package programs;

public class sortedarenot { 
	public static void main(String args[]) {
		boolean isSorted=true;
		int[] arr= {1,2,3,4,5,6,7};
		
		
		for(int i=0;i<arr.length-1;i++) { // we have to take length-1 because last value is 7
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("not sorted");
		}
	}

}
