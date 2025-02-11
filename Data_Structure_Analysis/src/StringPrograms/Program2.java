package StringPrograms;

public class Program2 {
	public static void main(String[] args) {
		
		String string="hello"; // both strings are same 
		String string2="hello"; // string values is same so that string and string 2 is pointing to the same address 
		if(string.endsWith(string2)) {
			System.out.println("both strings are same ");
		}
		
		if(string.equals(string2)) {
			System.out.println("both strings are same ");
		}
		
		// object address are always whenever we are creating a string without using the new operator for
		// the same strign values example  :  - string ="hello" string2="hello" 
		if(string==string2) {
			System.out.println("both strings are same ");
		}
	}
}
