package StringExample;
// hi hello java how are you 
// how are you java hello hi

public class StringExample6 {
	public static void main(String[] args) {
		String s1="hi hello java how are you";
		String[] s2=s1.split(" ");
		for(int i=s2.length/2;i<=s2.length-1;i++){
			System.out.print(s2[i]+" ");
		}
		
		
		
	    for(int i=s2.length/2-1;i>=0;i--) {
	    	System.out.print(s2[i]+" ");
	    }
	}

}
