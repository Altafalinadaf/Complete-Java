package com.junit.withoutjunit;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		int result = cal.divide(10, 2);
		
//		checking test case manually 
		if(result==5)
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
		
//		checking one more test case manually without using JUnit
		int result2=cal.divide(10, 5);
		if(result2==2) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}

}
