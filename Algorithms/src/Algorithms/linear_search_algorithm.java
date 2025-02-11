package Algorithms;

import java.util.Scanner;

/*
 * Linear search algorithm is a basic searching algorithm that sequentially searches for a given value in a list or array of elements.
 *  It works by comparing the target value with each element in the list one by one until a match is found or the entire list is traversed
 */

public class linear_search_algorithm {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// here we initialize the array as 50 
		int[] arr=new int[50];
		
		// we are taking the key for comparing the array values to user input key 
		int key=0;
		
		// if the value is found in the array it execute and return the loop 
		boolean found=false;
		
		
		System.out.println("Enter the number :");
		int num=scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.print("Enter the number "+i+" : ");
			arr[i]=scanner.nextInt();
		}
		
		// asking user to the key value
		System.out.print("Enter the key element : ");
		key=scanner.nextInt();
		
		// checking the each value one by one whether it's matching with the key value or not
		for(int i=0;i<num;i++) {
			
			// checking the arr[i]==key,
			// here we go first then 2nd then 3rd until total array complete if value found print key found boolean true condition break
			if(arr[i]==key) {
				System.out.println("Key Found");
				found=true;
				break;
			}
		}
		
		// if the key is not equal then print not found
		if(!found) {
			System.out.print("Not Found");
		}
		
		scanner.close();
		
		// print the total number of arrays in given list
		System.out.print("The array list is : ");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
