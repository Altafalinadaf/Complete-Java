package maximumnumber;

public class Solution {
	 public static void main(String args[]) {
		 int a=1;
		 int b=2;
		 int c=3;
		 int max;
		 if (a>b) {
			 if(a>c) {
				 max=a;
				
			 }else {
				 max=c;
			 }
		 }else {
			 if(b>c) {
				 max=b;
				 
			 }else {
				 max=c;
			 }
		 }
		 
		 System.out.println(max);
	 }		 
}