package Day1;

public class Example6 {
	static void convertStringArray(String str) {
		int count=0;
		String[] strings=str.split(" ");
		for(int i=0;i<strings.length;i++) {
			count=checkString(strings[i]);
			if(count==4) {
				System.out.print(strings[i]+" ");
			}
		}
		//System.out.println(count);
	}
	static int checkString(String str) {
		//System.out.println(str);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String string="cool ram sita wow mom nom";
		convertStringArray(string);
		
	}

}
