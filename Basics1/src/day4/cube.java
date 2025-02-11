package day4;

import java.util.Scanner;

// example 8 is a cube 
// 2*2=4*2=8 or 2^3=8

public class cube {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		double cubeRoot= Math.cbrt(num); // use double here because the value might have stored in floating point example : 27 cube is 3.0
		int CubeRoot=(int)cubeRoot; // here we have to convert the double to int example : 3.0 to 3 
		if(cubeRoot==CubeRoot) { // check of the both same are not example : 3
		
			System.out.println("Number is a cube");
			
			
		}else {
			System.out.println("Number is not a cube");
		}
		sc.close();

	}
	

}
