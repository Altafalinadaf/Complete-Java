package PractiseSet;

public class Programs {
	public static void main(String args[]){
	       String str="hai java is easy";
	       int count=0;
	       char c='a';
	      @SuppressWarnings("unused")
		char[] ch=str.toCharArray();
	       for(int i=0; i<str.length();i++){
	            if(c==str.charAt(i)){
	                     count++;
	            }
	       }
	       System.out.println(count);

      }
}
