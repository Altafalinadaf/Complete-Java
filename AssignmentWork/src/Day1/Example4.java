package Day1;

public class Example4 {
	static void convertingCharArray(String str) {
		
		char[] ch=str.toCharArray();
		convertingStringArray(ch);
	
	}
	static void convertingStringArray(char[] ch) {
		String[] store=new String[ch.length];
		for(int i=0;i<ch.length;i++) {
		     store[i]=String.valueOf(ch[i]);
		
		}

		
		int counts=divideString(store);
		System.out.println(counts);

	}
	static int divideString(String[] store) {
		 int count=0;
		for(int i=0;i<store.length;i++) {
			if(i%2==0) {
			     count=count+ countChar(store[i]);
			     
			}
		}
	    
		for(int i=0;i<store.length;i++) {
			
		}
	
		return count;
	}
	
	static int countChar(String str ) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if('a'==str.charAt(i)) {
				count++;
			}
		}
	
		return count;
		
		
	}
	public static void main(String[] args) {
		String str="cool java mava rataa";
		convertingCharArray(str);
		
	}

}
