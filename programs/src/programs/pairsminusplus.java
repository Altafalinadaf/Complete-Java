package programs;
import java.util.Scanner;

public class pairsminusplus {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int count=0;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i!=j && arr[i]-arr[j]==k) {
					count++;
				}
			}
		
		}
		System.out.println(count);
		sc.close();
	}

}
//5 2 // take 5 number as input and make it 2 pairs
//1 5 3 4 2 // taken 5 inputs
//1,5 1,3 1,4 1,2 5,3 5,4 5,2 3,4 3,2 4,2 // here pairs are done
//0   1   1   1   2    2   2   2   2  3 last increment number is 3
