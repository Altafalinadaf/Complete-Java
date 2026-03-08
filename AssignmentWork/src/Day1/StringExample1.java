package Day1;

public class StringExample1 {
	static void converString(String str) {
		int counts=0;
		
		String[] str2 = str.split(" "); // it is used for the given user Input 
		
		for(int i=0;i<str2.length;i++) {
			if(i%2==0) {
				counts=counts+convertCharArray(str2[i]);
				System.out.println(str2[i]);
			}
		}
		System.out.println(counts);
	}
	static int convertCharArray(String str) {
		int counts=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if('a'==ch[i]) {
				counts++;
			}
		}
		return counts;
	}
	
	
	public static void main(String[] args) {
		String str="cool java mava rataa";
		converString(str);
		
	}

}
