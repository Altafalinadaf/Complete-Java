package Apps;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner=new Scanner(System.in);
	
	
	static int[] cal() {
		System.out.println("Enter the Number How much you want ");
		System.out.print("Enter the total Numbers : ");
		int num=scanner.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+" Number : ");
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	
	static void add() {
		int[] arr=cal();
		int sum=0;
		for(int element : arr) {
			sum+=element;
		}
		System.out.println("The Sum of given Number is : "+sum);
		System.out.println("***********************************");
	}
	static void sub() {
		int[] arr=cal();
		int sub=arr[0];
		for(int i=1;i<arr.length;i++) {
			sub-=arr[i];
		}
		System.out.println("The Sub of given number is : "+sub);
		System.out.println("***********************************");
	}
	static void mul() {
		int[] arr=cal();
		int mul=1;
		for(int element:arr) {
			mul=mul*element;
		}
		System.out.println("The Mul of given number is : "+mul);
		System.out.println("***********************************");
	}
	static void div() {
		int[] arr=cal();
		double div=arr[0];
		for (int i = 1; i < arr.length; i++) {
	        if (arr[i] == 0) {
	            System.out.println("change the division");
	            return;
	        }
	        div = (double) div / arr[i];
	    }
	    System.out.println("The Div of given numbers is " + div);
	    System.out.println("***********************************");
	}

	static void chooseInput() {
		
		while(true) {
			System.out.println("Choose the given list ");
			System.out.print("1.Add()\n2.Sub()\n3.Mul()\n4.Div()\nEnter the number here : ");
			int num=scanner.nextInt();
			switch(num) {
			case 1 : 
				add();
			    break;
			case 2:
				sub();
			    break;
			case 3: 
				mul();
				break;
			case 4:
				div();
				break;	
			
			default:
				System.out.println("Invalid Option");
				break;
			}	
			System.out.println("1.for Start\n2.for Stop ");
			int n1=scanner.nextInt();
			if(n1==1) {
				continue;
			}
			else if (n1==2) {
				System.out.print("Thank you hava a nice day ");
				break;
				
			}
			
		}
	}
//	static boolean checkCondition() {
//		System.out.print("To perform once again\nPlease Enter \n1.For start\n2.for Stop : ");
//		int n=scanner.nextInt();
//
//		if(n==1 ) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	public static void main(String[] args) {
		chooseInput();
	}

}
