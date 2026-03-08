package StringPrograms;

public class Program1 {
	public static void main(String[] args) {
		String string=new String("hello"); // new opertor will always create a new object with new address
		String string2=new String("hello");// '' '' '' 
		
		if(string.endsWith(string2)) {
			System.out.println("both strings are same ");
		}
		
		if(string.equals(string2)) {
			System.out.println("both strings are same ");
		}
		
		// object address are always different
		if(string==string2) {
			System.out.println("both strings are same ");
		}
	}
}
