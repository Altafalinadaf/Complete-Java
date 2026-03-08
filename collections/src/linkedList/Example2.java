package linkedList;

import java.util.Arrays;
import java.util.LinkedList;


public class Example2 {
	public static void main(String[] args) {
		LinkedList<String> animal=new LinkedList<String>(Arrays.asList("Monkey","Tiger","lion","dog"));
		System.out.println(animal.get(2));
	}

}
