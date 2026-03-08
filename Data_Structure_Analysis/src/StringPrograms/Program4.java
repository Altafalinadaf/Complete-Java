package StringPrograms;

public class Program4 {
	public static void main(String[] args) {
		StringBuilder string = new StringBuilder("Hello");
		int len=string.length();
		System.out.println(len/2);
		
		int i=0;
		int len2=len;
		while(i<len/2) {
			
			char frontChar=string.charAt(i);
			char backChar=string.charAt(len-1-i);
			string.setCharAt(i, backChar);
			string.setCharAt(len2-i-1, frontChar);
			
			i++;
		}
		System.out.println(string);
	}

}
