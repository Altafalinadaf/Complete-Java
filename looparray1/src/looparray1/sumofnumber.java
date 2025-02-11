package looparray1;

public class sumofnumber {
	public static void main(String args[]) {
		int n=2341224;
		int temp=n;
		int sum=0;
		while( temp !=0) {
			int res=temp%10;
			sum +=res;
			temp /=10; // prepare the number for next iteration because we have already consider the
			           // last digit in sum
			System.out.println("Number:" +temp+ "sum:"+sum);
		}
		System.out.println("Final sum of digit"+sum);
	}

}
