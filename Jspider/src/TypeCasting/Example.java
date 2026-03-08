package TypeCasting;

public class Example {
	public static void main(String[] args) {
		double a='a';
		System.out.println(a ); // upper case alphabets starts  with 65 
		
		char a1=101;
		System.out.println(a1);
		
		int a2=101;
		char ch=(char)a2;
		System.out.println(ch);
		
		
		char ch3='A';
		System.out.println(ch3);
		
		int b=ch3;
		System.out.println(b);
		
		
		char ch4='a';
		int b1=ch4;
		System.out.println(b1+4);
		
		
		char ch5='a';
		int b2=ch5+4;
		ch5=(char) b2;
		System.out.println(ch5);
		
		
		char ch7='a';
		System.out.println((char)(ch7+4));
		
		char ch8='a';
		int no=(int)ch8;
		 ch8=(char) ((char)no+4);
		System.out.println(ch8);
		
		
		
	}

}
