package Java_Programms;

public class Program111 {
	public static void main(String[] args) {
		int[] arr=new int[122];
		String n="";
		
		for(int i=0;i<arr.length;i++) {
			int no=i;
			n="";
			while(no>0) {
				int rem=no%2;
				n=rem+n;
				no/=2;	
			}
			System.out.println(i+"->"+n);
		}
	}

}
