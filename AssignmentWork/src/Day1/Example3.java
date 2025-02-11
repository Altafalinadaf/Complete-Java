package Day1;
// simple compare to both

public class Example3 {
	static void convertStringArray(String str) {
		int count=0;
		String[] strings=str.split(" ");
		for(int i=0;i<strings.length;i++) {
			if(i%2==0) {
				count=count+accuranceOfA(strings[i],count);
			}
		}
		System.out.println(count);
	}
	static int accuranceOfA(String str,int count) {
		count=0;
		for(int i=0;i<str.length();i++) {
			if('a'==str.charAt(i)) {
				count++;
			}
			
		}
		return count ;
	}
	public static void main(String[] args) {
		String string="cool java mava rataa";
		convertStringArray(string);
	}

}
