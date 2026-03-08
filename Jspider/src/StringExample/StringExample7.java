package StringExample;
//hi helo java how are you 
// you are how hi hello java


public class StringExample7 {
	public static void main(String[] args) {
		String s1="hi hello java how are you";
	    String[] s2=s1.split(" ");
		for(int i=s2.length-1;i>=s2.length/2;i--) {
			System.out.print(s2[i]+" ");
		}
		for(int i=0;i<s2.length/2;i++) {
			System.out.print(s2[i]+" ");
		}
	}

}
