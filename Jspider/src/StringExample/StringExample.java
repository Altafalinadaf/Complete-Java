package StringExample;
// java is programming language
// language programming is java

public class StringExample {
	public static void main(String[] args) {
		String string="java is programming language";
		String[] strings=string.split(" ");
		for(int i=strings.length-1;i>=0;i--) {
			System.out.print(strings[i]+" ");
		}
		
	}

}
