package JavaImportantPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	static void primeOrNot(int s,int e){
		boolean flag=true;
		for(int i=s;i<=e;i++) {
			flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("prime     : "+i);
			}
			else {
				System.out.println("Not prime : "+i);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the starting Range  : ");
		int startRange=a.nextInt();
		System.out.println("Enter the end of range : ");
		int endRange=a.nextInt();
		primeOrNot(startRange,endRange);
		a.close();
	}
	

}
