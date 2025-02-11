package StringExample;
// hi hello java how are you 
// java hello hi how are you 

public class StringExample3 {
	public static void main(String[] args) {
		String str1="ho hello java how are ";
	    String[] str2=str1.split(" ");
	    for(int i=2;i>=0;i--) {
	    	System.out.print(str2[i]+" ");
	    }
	    for(int i=2;i<=str2.length-1;i++) {
	    	System.out.print(str2[i]+" ");
	    }
	}

}
