package vector;

import java.util.Vector;

public class Example1 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		System.out.println(vector);
//		by default for each the capacity will be 10
		System.out.println(vector.capacity());
		
//		adding capacity 2 here
		Vector<Integer> vector2=new Vector<Integer>(2);
		vector2.add(1);
		vector2.add(2);
		System.out.println(vector2);
		System.out.println(vector2.capacity());
//		for vector we had a capacity initial capacity 2
//		and the moment we add one more value then the capacity will become double which is 4
		vector2.add(3);
		System.out.println(vector2);	
//		initial capacity 2, if added then double which 4
		System.out.println(vector2.capacity());
		
		vector2.add(4);
		System.out.println(vector2);
		System.out.println(vector2.capacity());
		
//		if I added again it will double 4 to 8 
		vector2.add(5);
		System.out.println(vector2.capacity());
		
//		we also pass initial capacity and also increament once it reached 
//		inital capacity is 2 in vector3 and then once we stored 2 value capacity remains to 2 if i added one more value, then it increase to 3, so 2+3=5
		Vector<Integer> vector3=new Vector<Integer>(2,3);
		vector3.add(1);
		vector3.add(2);
		System.out.println(vector3);
		System.out.println(vector3.capacity());
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.capacity());
	}

}
