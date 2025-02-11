package IntegerToArray;

public class IntegerToArray {
	 static int count() {
		int n=1234;
		int count=0;
		while(n!=0) {
			
			
			n/=10;
			count++;
		}
	//	System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		int num=1234;
		int pos=count()-1;
		
	//	System.out.println(pos);
		int[] arr=new int[pos+1];
		int i=0;
		while(num>0) {
			int rem=num%10;
			//System.out.println(rem);
			arr[pos-i]=rem;
			//System.out.println(arr[i]);
			//System.out.println(arr[pos-i]);
			
			//System.out.println(i);
			i++;
			//System.out.println(i);
			num/=10;
			
		}
		for(int j=0;j<=pos;j++) {
			System.out.print(arr[j]);
		}
	}

}
