package arrayList;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
//		how to create array list 
		ArrayList<String> list=new ArrayList<>();
		
//		how to add element inside list
		list.add("Tony");
		list.add("Stark");
		
//		how to print whole list
		System.out.println(list);
		
//		how to insert element inside list
//		inserting element at index 1 shifting other elements
		list.add(1,"Iron Man");
		System.out.println(list);
		
//		how to get particular value
		System.out.println(list.get(1));
		
//		how to change element 
//		set index 0 to Thor
		list.set(0, "Thor");
		
		System.out.println(list);
		
//		how to remove element in list
		list.remove(0);
		System.out.println(list);
		
		list.add("thor");
		list.add("america");
		list.add("wonda");
		list.add("hulk");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
//		we can also use foreach loop 
		for (String x : list) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
//		how to clear list
		list.clear();
		System.out.println(list);
		
		
		
	}

}
