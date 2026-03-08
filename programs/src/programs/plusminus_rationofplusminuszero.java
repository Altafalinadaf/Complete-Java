package programs;
import java.util.Scanner;


public class plusminus_rationofplusminuszero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}   
		double positive=0.0;
		double negative=0.0;
		double zero=0.0;
		
		for(int i=0;i<n;i++) {
			if (arr[i]>0) 
				
				positive++;
				
			else if (arr[i]<0)
				
				negative++;
				
		   else
			   zero++;
		}
		System.out.println(positive/n);
		System.out.println(negative/n);
		System.out.println(zero/n);
		sc.close();
				
     } 

}
