package HackerRankPrograms;

import java.util.Scanner;

public class progrma3 {
	public static void main(String []argh){
	   Scanner scanner=new Scanner(System.in);
	   System.out.print("Enter the number of Input : ");
	   int input=scanner.nextInt();
	   for(int i=0;i<input;i++) {
		   System.out.print("Enter the starting range : ");
		   int startingNum=scanner.nextInt();
		   System.out.print("Enter the Number that number will carry the power^n : ");
		   int Mul=scanner.nextInt();
		   System.out.print("Enter the last Range of Number : ");
		   int EndRange=scanner.nextInt();
		  /* for(int j=startingNum+1;j<=EndRange;j++) {
			   startingNum=(int) (startingNum+Math.pow(Mul,j));
			   System.out.print(startingNum+" ");
		   }
		   System.out.println();
		   */
		   // we can also write like this 
		   
		   for(int j=0;j<EndRange;j++) {
			   startingNum=startingNum+Mul;
			   if(startingNum>0) {
				   System.out.print(" ");
			   }
			   System.out.print(startingNum);
			   Mul=Mul*2;
			   
		   }
		   System.out.println();
		   
	   }
	   scanner.close();
	}
}