package StringExample;
// hi hello java how are you 
// java hello hi how are you 

public class StringExample2 {
	public static void main(String[] args) {
		String string="hi hello java how are you";
		String[] string2=string.split(" ");
		for(int i=2;i>=0;i--) {
			System.out.print(string2[i]+" ");
		}
		for(int i=2;i<=string2.length-1;i++) {
			System.out.print(string2[i]+" ");
		}
		
	}

}
