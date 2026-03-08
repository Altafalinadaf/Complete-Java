package PractiseSet;

public class NextPrimNumber {
	public static void main(String[] args) {
		int n=3;
		int count=0;
		int n1=0;
		for(int i=n+1;i<10;i++) {
			count=0;
		    n1=i;
			//System.out.println(n1);
			for(int j=1;j<=n1;j++) {
				if(n1%j==0) {
					//System.out.println(n1+" "+j);
					count++;
				}
				
			//	System.out.println(count);
			}	
			if(count==2) {
				System.out.println(n1);
				break;
			}
			
		}
		
		
	}

}
