package JavaImportantPrograms;

import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {
		String s1="care";
		String s2="race";
		if(s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean result=Arrays.equals(c1, c2);
			if(result==true) {
				System.out.println("Anagram ");
			}
			else {
				System.out.println("Not an anagram ");
			}
		}
		else {
			System.out.println("Not an anagram");
		}
	}

}
