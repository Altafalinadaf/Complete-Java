package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyIntSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		it will come in acending order 
//		return o1-o2;
		
//		it will come in decending order
		return o2-o1;
	}
	
}

class MyStringSorting implements Comparator<String>{
	public int compare(String o1,String o2) {
//		this will gives reverse order
//		return o2.length()-o1.length();
		
//		this gives acending order
		return o1.length()-o2.length();
	}
}
public class ComparatoExample {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(6);
		System.out.println(list);
//		we can sort a list using collections
//		Collections.sort(list);
		
		list.sort(new MyIntSorting());
		System.out.println(list);
		
		
//		one more example for comparator 
		List<String> list2=new ArrayList<String>();
		list2.add("Superman");
		list2.add("Flash");
		list2.add("super women");
		list2.add("Aquman");
		
		
//		it will short
//		it short by first letter 
//		Collections.sort(list2);
		System.out.println(list2);
		
		
		list2.sort(new MyStringSorting());
		System.out.println(list2);
	}

}
