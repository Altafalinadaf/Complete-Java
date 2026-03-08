package methodsarguments;

// we can pass n number of arguments here re

import java.util.Scanner;

public class Var_Arguments {
	static int add(int ...arr) {
		int result=0;
		for(int a:arr) {
			result+=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of number : ");
		int num=scanner.nextInt();
		int[] arr1=new int[num];
		System.out.println();
		for(int i=0;i<num;i++) {
			arr1[i]=scanner.nextInt();
		}
		int sum=add(arr1);
		System.out.println("The sum of Values is : "+sum);
		scanner.close();
	}
	

}
