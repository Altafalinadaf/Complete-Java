package StringExample;
//hi hello java how are you 
// hello how you

public class StringExample5 {
	public static void main(String[] args) {
		String s1="hi hello java how are you";
		String[] s2=s1.split(" ");
		for(int i=0;i<=s2.length-1;i++) {
			if(i%2==1) {
				System.out.print(s2[i]+" ");
			}
		}
	}

}
