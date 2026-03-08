package day1;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter the number of array : ");
			int num=scanner.nextInt();
			int[] arr=new int[num];
			System.out.println("Enter the "+num+" descending number ");
			for(int i=0;i<num;i++) {
				System.out.print("Enter the "+i+ " element : ");
				 arr[i]=scanner.nextInt();
			}
			
			for(int i=1;i<num;i++) {
				// first it goes for this below condition then next it goes upper then below condition
				for(int j=0;j<num-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			scanner.close();
			System.out.println("The sorting of array is ");
			for(int i=0;i<num;i++) {
				System.out.println(arr[i]);
			}
			
	}

}
