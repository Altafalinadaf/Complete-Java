package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
//		auto boxing
//		arraylist we can only store objects
//		java converts primitive data type into non-primitive type
	    list.add(1);
	    list.add(2);
	    list.add(3);
//	    by default it add like this using auto boxing 
	    list.add(Integer.valueOf(4));
		System.out.println(list);
		
//		it will not remove the value 1, it removes values of index 1
//		remove method will take index value as well object value
		list.remove(1);
		System.out.println(list);
		
//		now it will remove the actual values
		list.remove(Integer.valueOf(4));
		System.out.println(list);
		
		
//		same example for non-primitive type 
//		strings 
		List<String> list2=new ArrayList<String>();
		list2.add("iron man");
		list2.add("Thor");
		list2.add("captain america");
		
		System.out.println(list2);
		
//		it removes 0th index value
		list2.remove(0);
		System.out.println(list2);
		
//		it removes actual value
		list2.remove("Thor");
		System.out.println(list2);
		
		
		
	}

}
