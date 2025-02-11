package programs;

import java.util.Scanner;

public class multiplicationobjmethod {
		int multi(int n) {
			for (int i=1;i<=10;i++) {
				System.out.printf("%d X %d =%d\n",n,i,n*i);
			}
			return n;
		}
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of multiplication :");
			int n1=sc.nextInt();
			multiplicationobjmethod Obj =new multiplicationobjmethod();
		    Obj.multi(n1);
			sc.close();
			}

}
