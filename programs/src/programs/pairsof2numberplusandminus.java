package programs;

import java.util.Scanner;
// 5 2
// 1 5 3 4 2
// 1,5 1,3 1,4 1,2 5,3 5,4 5,2 3,4 3,2 4,2
// 0   1   1   1   2    2   2   2   2  3

public class pairsof2numberplusandminus {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int count=0;
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]-arr[j]==k || arr[j]-arr[i]==k) {
					count++;
					
				}
			}
		}
		System.out.println(count);
		input.close();
	}

}
