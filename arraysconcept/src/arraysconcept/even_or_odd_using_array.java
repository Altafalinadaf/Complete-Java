package arraysconcept;

import java.util.Scanner;

public class even_or_odd_using_array {
	public static void main(String[] args) {
		int[] arr= new int[50];
		int i=0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number :");
			int num=scanner.nextInt();
			
			
			for(i=1;i<=num;i++) {
				System.out.print("Enter the number "+i+" : ");
				arr[i]=scanner.nextInt();
				
			}
			for(i=1;i<=num;i++) {
				System.out.print("Array of elements "+arr[i]+" : ");
				if(arr[i]%2==0) {
					System.out.print("even");
				}
				else {
					System.out.print("odd");
				}
				System.out.println();
			

			}
		}	
		
	
	}
	

}
