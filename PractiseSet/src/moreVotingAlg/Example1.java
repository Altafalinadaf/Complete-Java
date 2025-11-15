package moreVotingAlg;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		
//		First Method to find this
		/*
		int arr[]= {1,4,3,2,1,2,3,1,1};
		int n=arr.length;
		for (int i=0;i<n;i++) {
			int count =0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}	
				
			}
			if(count>=n/2) {
				System.out.println("MJ number is = "+arr[i]+" "+n/2+" "+count);
				break;
			}
		}
		*/
		/*
//		Second method
		int arr[]= {1,4,3,2,1,2,3,1,1};
		int n=arr.length;
		Arrays.sort(arr);
		int count=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				count=1;
			}
			if(count>=n/2) {
				System.out.println("MJ number is = "+arr[i]+" "+n/2+" "+count);
			}
			
		}
		*/
		
//		Third method
		int arr[]= {1,2,4,2,1,2,2,1,1};
		int n=arr.length;
		int count=0;
		int canditate = 0;
		for(int i=0;i<n;i++) {
			if(count==0) {
				canditate=arr[i];
			}
			if(canditate==arr[i]) {
				count++;
			}
			
			else {
				count--;
			}
		}
		System.out.println("MJ number is = "+canditate);
		
		
	}
}
