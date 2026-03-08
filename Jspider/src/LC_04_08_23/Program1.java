package LC_04_08_23;

public class Program1 {
	public static void main(String[] args) {
		int[] arr=new int[127];
		String n="";
		
		for(int i=0;i<=arr.length;i++) {
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
