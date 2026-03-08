package Logical_Programming;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int size=scanner.nextInt();
		int[] arr123=new int[size]; 
		for(int i=0;i<size;i++) {
		
			System.out.println("Enter the "+(i+1)+" Number : ");
			arr123[i]=scanner.nextInt();
			
			
		}
		System.out.println("My Array is : ");
		for(int i=0;i<size;i++) {
			
			System.out.print(arr123[i]+" ");
		}
		scanner.close();
		
		
		
		
		
	}

}
