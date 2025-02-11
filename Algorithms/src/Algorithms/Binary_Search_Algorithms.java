package Algorithms;

import java.util.Scanner;

public class Binary_Search_Algorithms {
	public static void main(String[] args) {
		int n,target;
		// this below line used for scanner it's not imp
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		n=scanner.nextInt();
		int[] arr=new int[n];
		
		
		System.out.print("Enter the"+n+" ascending order numbers : ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the target number : ");
		target=scanner.nextInt();
		
		int left=0;
		int right=n-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("the "+target+ " found in index of "+mid);
				return;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
	
		
		System.out.println(target+" not found in the array");
		
		
	}

}
