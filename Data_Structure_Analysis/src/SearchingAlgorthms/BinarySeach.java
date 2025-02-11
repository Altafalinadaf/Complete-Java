package SearchingAlgorthms;

public class BinarySeach {
	public static void main(String[] args) {
		int a[]= {2,1,34,12,35,2,87,0};
		// 1 2 12 34 2 35 0 87 
		// 1 2 12 2 34 0 35 87
		// 1 2  2 12 0 34 35 87
		// 1 2 2 0 12 34 35 87
		// 1 2 0 2 12 34 35 87
		// 1 0 2 2 12 34 35 87
		// 0 1 2 2 12 34 35 87
		
		// for each loop we will get big value at the end 
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
			k++;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("number of time sorting loop runs = "+k);
		
		
		
		int key = 87;
		int i=0;
		
		int left=0;
		int right=a.length-1;
		
		while(left<=right) {
			i++;
			int mid=(left+right)/2;
			System.out.println(mid);
			
			if(a[mid]==key) {
				System.out.println("found key ");
				System.out.println("loop : "+i);
				return;
			}
			else if(a[mid]<key) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("loops : "+i);
		
		System.out.println("key not found");
	}

}
