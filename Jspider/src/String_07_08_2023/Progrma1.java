package String_07_08_2023;

public class Progrma1 {
	public static void main(String[] args) {
		String str="hi java how are you";
		// convert into char array h i  j a v a  h o w  a r e  y o u // 104 72 106-74
		char[] ch=str.toCharArray();
		char ch1=(char) (ch[0]-32);
		ch[0]=ch1;
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==' ') {
				int j=i+1;
				ch[j]=(char) (ch[j]-32);
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	
	}

}
