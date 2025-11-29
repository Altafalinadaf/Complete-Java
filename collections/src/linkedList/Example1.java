package linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
//		we can use list also as parent class as we know 'List' is the parent class of 'LinkedList'
//		we we go with list reference we cannot use more features
		List<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		list.add(1);
		list.add(2);
		list.add(3);
//		for list reference we don't method addFirst() and addLast()
//		list.addFisrt(0);
		System.out.println(list);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.addFirst(0);
		list2.addLast(6);
		System.out.println(list2);
		
		
//		creating list with prior base by using "Arrays.asList()" where can add elements at the time for creating list
		LinkedList<Integer> list3=new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(list3);
		list3.addFirst(0);
		list3.addLast(9);
		System.out.println(list3);
//		the  predicate will give the value in true or false based the codition we passed
//		we can use in lamda expression 
//		it removes the even values in a list 
		list3.removeIf(x -> x % 2 == 0);
		System.out.println(list3);
		
//		it removes the odd numbers in a given list
		list2.removeIf(y->y%2!=0);
		System.out.println(list2);
	}

}
