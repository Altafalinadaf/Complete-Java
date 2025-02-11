package programs;

import java.util.Scanner;

public class reverse_number_as_user_input {
	public static void main(String[] args) {
		int rev=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int num=scanner.nextInt();
		while(num!=0) {
			// 1) 1234 % 10=4  2) 123%10=3  3) 12%10=2; 4)  1%10=1;
			int res=num%10;
			// 1) 0=0*10+4=4  2) 4=4*10+3=43; 3)43=43*10+2=432;
			//rev= rev *10+rem;
			rev=res+(rev*10);
			 // 1) 1234/10=123  2) 123/10=12; 3)12/10=1 4)1/10=0;
			num /=10;
		}
		System.out.printf("The Reverse of given number is : "+rev);
		scanner.close();
	}
	
}
