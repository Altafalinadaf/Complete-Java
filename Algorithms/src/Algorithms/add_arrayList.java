package Algorithms;

public class add_arrayList {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= {60,70,80,90,100};
		
		int[] c=new int[10];
		
		int i,j,k;
		int len=0;
		int n1=5,n2=5;
		
		for(i=0,k=0;i<n1;i++,k++) {
			c[k]=a[i];
		}
		for(j=0,k=n1;j<n2;j++,k++) {
			c[k]=b[j];
		}
		len=n1+n2;
		System.out.println("The total of array of number is : "+len);
		
		
		for(k=0;k<len;k++) {
			System.out.println(c[k]);
		}
		
	}

}
