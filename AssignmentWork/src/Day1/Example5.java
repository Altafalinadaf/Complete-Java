package Day1;

public class Example5 {
	static void convertString(String str) {
		
		String[] str2=str.split(" ");
		for(int i=0;i<str2.length;i++) {
			checkString(str2[i]);
			
		}
	}
	static void checkString(String str) {
		
		for(int i=0;i<str.length();i++) {
			if('o'==str.charAt(i)) {
				System.out.print(str+" ");
				break;
			}	
		}
		
	}
	public static void main(String[] args) {
	    String string="moon ram sam dam col";
	    convertString(string);
	    
	}

}
