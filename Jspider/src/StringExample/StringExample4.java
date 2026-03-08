package StringExample;
// hi hello java how are you 
// hi java are

public class StringExample4 {
	public static void main(String[] args) {
		String s2="hi hello java how are you";
		String[] s3=s2.split(" ");
		for(int i=0;i<s3.length-1;i++) {
			if(i==0) {
				System.out.print(s3[i]+" ");
			}
			if(i==2) {
				System.out.print(s3[i]+" ");
			}
			if(i==4) {
				System.out.print(s3[i]+" ");
			}
		}
		
	}

}
