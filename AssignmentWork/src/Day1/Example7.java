package Day1;

public class Example7 {
	static void convertStringArray(String str) {
		String[] str2=str.split(" ");
		int count=0;
		String revString="";
		for(int i=0;i<str2.length;i++) {
			count=countChar(str2[i]);
			if(count==1) {
				revString=str2[i];
				printing(revString);
				
				
////				System.out.println(str2[i]);

////				System.out.println(revString);
//				//System.out.println(revString);
//				for(int j=revString.length()-1;j>=0;j--) {
//					System.out.print(revString.charAt(j));
//				}
		        
//				System.out.print(" ");
			}
		}
	}
	static int countChar(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if('a'==str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	static void printing(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
	}
	
	public static void main(String[] args) {
		String string="java rama sita wake moon";
		convertStringArray(string);
	}

}
