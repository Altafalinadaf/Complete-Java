package Basic;

public class ArraysExample {
	static int fact(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		return fac;
	}
	
	public static void main(String[] args) {
		int sum=0;
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			sum=sum+fact(arr[i]);
		}
		System.out.println(sum);
		/*
		 * static void fact(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		//return fac;
	}
	
	public static void main(String[] args) {
		ArraysExample obj1=new ArraysExample();
		int sum=0;
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			sum=sum+fact(arr[i]);
		}
		System.out.println(sum);
	}
		 */
	}

}
