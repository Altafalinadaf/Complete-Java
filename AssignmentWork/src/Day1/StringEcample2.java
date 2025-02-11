package Day1;

public class StringEcample2 {
	static void convertStringArray(String str) {
		int counts =0;
		String[] str2=str.split(",");// in input there is comma(,) that's why we used here split(",");
		for(int i=0;i<str2.length;i++) {
			if(i%2==0) {
				counts=counts+convertCharArray(str2[i]);
				System.out.println(str2[i]);
			}
		}
		System.out.println(counts);
	}
	static int convertCharArray(String str) {
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if('a'==ch[i]) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		String str="cool,java,mava,rataa";
		convertStringArray(str);
	}

}
