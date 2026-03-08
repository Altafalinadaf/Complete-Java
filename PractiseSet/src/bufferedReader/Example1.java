package bufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example1 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please Enter your name ");
		String name=br.readLine();
		
		System.out.println("Please Enter your age : ");
		int age =br.read();
		
		System.out.println("name = "+name+"\nage = "+age);
	}

}
