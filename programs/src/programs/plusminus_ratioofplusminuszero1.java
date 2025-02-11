package programs;

import java.util.Scanner;

public class plusminus_ratioofplusminuszero1 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[] arr=new int[5];
		double positive=0.0;
		double negative=0.0;
		double zero=0.0;
		
		for (int i=0;i<num;i++) {
			arr[i]=input.nextInt();
			if(arr[i]>0)
				positive++;
			else if(arr[i]<0)
				negative++;
			else 
				zero++;
			
			
		}
		System.out.println(positive/num);
		System.out.println(negative/num);
		System.out.println(zero/num);
		
		input.close();
	}

}
