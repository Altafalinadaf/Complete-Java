package programs;

import java.util.Scanner;

public class sum_of_Average_number {
	public static void main(String[] args) {
		float num,i=1f,sum=0,avg=0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number : ");
		num=sc.nextInt();
		while(i<=num) {
			System.out.print("Enter the marks "+i+" : ");
			int mark=sc.nextInt();
			sum +=mark;
			i++;
		}
		avg=sum/num;
		System.out.printf("The Sum of Average is : "+avg);
		System.out.printf("\nthe sum of number is : "+sum);
		sc.close();
	}

}
