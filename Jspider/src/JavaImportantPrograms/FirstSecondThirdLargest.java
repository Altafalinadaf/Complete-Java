package JavaImportantPrograms;

public class FirstSecondThirdLargest {
	public static void main(String[] args) {
		int fl=0,sl=0,tl=0;
		// fl=Integer.MIN_VALUE; sl=Integer.MIN_VALUE; tl=Integer.MIN_VALUE; // both we can give
		int arr[]= {2,3,45,2,43,56,76,88};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fl) {
				tl=sl;
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl) {
				tl=sl;
				sl=arr[i];
				
			}
			else if(arr[i]>tl) {
				tl=arr[i];
			}
		}
		System.out.println("First Largest "+fl+"\nSecond Largest "+sl+"\nThird Latgest "+tl);
	}

}
