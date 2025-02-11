package StringExample;
//hi hello java how are you
// ih avaj era

public class StringExample9 {
	public static void main(String[] args) {
		String s1="hi hello java how are you";
		String[] s2=s1.split("");
		for(int i=0;i<=s2.length-1;i++) {
			if(i%2==0) {
				String s3=s2[i];
				String recString="";
				for(int j=0;j<=s2.length;j++) {
					recString=s3.charAt(j)+recString;
				}
			   System.out.print(recString);
			}
		}
	}

}
