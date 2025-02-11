package Logical_Programming;


public class StringExample {
	public static void main(String[] args) {
		String str="Hello java how are you";
		String[] s2=str.split("2");
		for(int i=0;i<s2.length/2;i++) {
			System.out.print(s2[i]+" ");
		}
		//System.out.println(s2);
		for(int i=s2.length-1;i>=s2.length/2;i--) {
			System.out.print(s2[i]+" ");
		}
	}

}
