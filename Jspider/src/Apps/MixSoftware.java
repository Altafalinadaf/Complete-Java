package Apps;

import java.util.Scanner;


public class MixSoftware {
static Scanner scanner=new Scanner(System.in);

   // This is the interface for all the methods 
	static int disp() {
		System.out.print("Enter the number : ");
		int num=scanner.nextInt();
		return num;
	}


    // Strong number,Armstrong number,Happy number 
	static void StrongNumbers() {
		System.out.println("Enter\n1.StrongNumber()\n2.ArmsStrongNumber()\n3.HappyNumber()\nEnter the number here : ");
		int num=scanner.nextInt();
		switch(num) {
		case 1:
			strongNumber();
			break;
		case 2:
			armStrongNumber();
			break;
		case 3:
			happyNumber();
			break;
		default: 
			System.out.println("Invalid Option");
		}
	
	}
	static void strongNumber() {
		int num=disp();
		int sum=0;
		int temp=num;
		while(num>0) {
			int fac=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++) {
				fac*=i;
			}
			sum+=fac;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("Strong Number : "+temp);
		}
		else {
			System.out.println("Not Strong Number : "+temp);
		}
		System.out.println("***********************************");
	}
	static void armStrongNumber() {
		int num=disp();
		int temp=num;
		int numberDigit=(int)Math.log10(temp)+1;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=Math.pow(rem, numberDigit);
			num/=10;
		}
		if(temp==sum) {
			System.out.println("ArmStrong Numeber : "+temp);
		}
		else {
			System.out.println("Not ArmStrong Number : "+temp);
		}
		System.out.println("***********************************");
		
	}
	static int singleDigit(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem*rem;
			num/=10;
		}
		return sum;
		
	}
	
	static void happyNumber() {
		int num=disp(); // 1 9 10 1 1
		int temp=num;
		while(num>9) {
			num=singleDigit(num);
		}
		if(num==1 || num==7) {
			System.out.println("Happy Number : "+temp);
		}
		else {
			System.out.println("Not Happy Number : "+temp);
		}
		System.out.println("***********************************");
	}
	
	// All for Calculation here add,sub,mul,div
    static void Calculation() {
    	System.out.print("1.Add()\n2.Sub()\n3.Mul()\n4.Div()\n\nEnter the number here : ");
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
		default :
			System.out.println("Invalid Option");
		}
    }
    	

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
	
	// Here is Prime, Next Prime Number and Prime Range
	static void Prime() {
		System.out.print("Please Enter\n1.PrimeNumber()\n2.NextPrimeNumber()\n3.PrimeRange()\nEnter Here : ");
		int n=scanner.nextInt();
		if(n==1) {
			primeNumber();
		}
		else if(n==2) {
			nextPrime();
		}
		else if(n==3) {
			primeRange();
		}
		else {
			System.out.println("Ooh Sorry Out of Range\nThank You Have a Good Day");
		}
		
	}
	static void primeNumber() {
		
		int num=disp();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Nummber : "+num);
		}
		else {
			System.out.println("Not Prime Number : "+num);
		}
		
		System.out.println("***********************************");
	}
	static void nextPrime() {
		int num=disp();
		for(int j=num;j<=100000;j++) {
			int num1=j+1;
			int count=0;
			for(int i=1;i<=num1;i++) {
				if(num1%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Prime Nummber : "+num1);
				break;
			}
			
//			else {
//				System.out.println("Not Prime Number"+num1);
//				break;
//			}	
		}
		System.out.println("***********************************");
		
	}
	static void primeRange() {
		int num=1;
		for(int j=num;j<=10;j++) {
			int num1=j+1;
			int count=0;
			for(int i=1;i<=num1;i++) {
				if(num1%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Prime Nummber    : "+num1);
				
			}
			else {
				System.out.println("Not Prime Number : "+num1);
				
			}	
		}
		System.out.println("***********************************");
		
	}
	
	// here is Factorial number ,Factors of Number and Perfect Number 
	static void Factorial() {
		System.out.print("Enter the number\n1.FactorialNumber\n2.FactorsNumeber\n3.PerfectNumber\nEnter here :");
		int num=scanner.nextInt();
		if(num==1) {
			factorialNumber();
		}
		else if(num==2) {
			factorsNumber();
		}
		else if(num==3) {
			perfectNumber();
		}
		else {
			System.out.println("Invalid Enter");
		}
		
	}
	static void factorialNumber() {
		int n=disp();
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		System.out.println("The factorial of "+n+" is : "+fac);
		System.out.println("***********************************");
	}
	static void factorsNumber() {
	    int n=disp();
	    System.out.println("The factors of Given Numbers are ");
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("***********************************");
	}
	static void perfectNumber() {
		int n=disp();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(n==sum) {
			System.out.println(n+" Perfect Number");
		}
		else {
			System.out.println(n+" not Perfect Number");
		}
		System.out.println("***********************************");
	}
	static void chooseInput() {
		
		while(true) {
			System.out.println("Choose the given list ");
			System.out.print("1.Calculation()\n2.Prime()\n3.Factorial()\n4.StrongNumbers()\nEnter the number here : ");
			int num=scanner.nextInt();
			switch(num) {
			case 1 : 
				Calculation();
			    break;
			case 2:
				Prime();
			    break;
			case 3: 
				Factorial();
				break;
			case 4:
				StrongNumbers();
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
				System.out.println("Thank you hava a nice day ");
				break;
				
			}			
		}
	}
	
	
	public static void main(String[] args) {
		chooseInput();
	}
}
