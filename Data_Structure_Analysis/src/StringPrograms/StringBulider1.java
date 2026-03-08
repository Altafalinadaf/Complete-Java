package StringPrograms;

public class StringBulider1 {
	public static void main(String[] args) {
		
		// String and StringBuilder is similar but in strigbuilder we have some default mathods 
		// string is slower than stringBuilder 
		// string not have more methods to  perform operatrions 
		
		
		// note : any manipulation happens in string the string will store in non constant pool area
		// while manipulation the string will create the new string and the old string get delete
		// example : string = "hello";//old string is "hello"  string =string +"2"; //new string is "hello2"
		// here old string will get delete new string will be added 
		// but in stringbuilder string will be modified in same string 
		StringBuilder stringBuilder=new StringBuilder("hi this is Altaf");
		System.out.println(stringBuilder);
		
		
		// StrignBuilder methods :
		
		// append () : 
		// append will add the string or character at the last of your string
		stringBuilder.append(" Ali");
		
		System.out.println(stringBuilder);
		
		
		//  insert (index position, value) : 
		// insert method will add the character or string in between or we can add the character in anywhere of our string
		
//		stringBuilder.insert(20, '2');
		
		stringBuilder.insert(stringBuilder.length(), "ali");
		
		
		System.out.println(stringBuilder);
		
		
		// setCharAt(index value, value);
		//setCharacter method is used to set the char by removing the old char in that particular position
		stringBuilder.setCharAt(20, 'A');
		System.out.println(stringBuilder);
		
		
		// delete(starting index(include),ending index(exclued)); 
		stringBuilder.delete(20, 24);
		System.out.println(stringBuilder);
		
	}

}
