package Java_Programms;

public class LargestPrimeNumber {
	static void checkPrime() {
		int count=0;
		int large =0;
		for(int i=1;i<=10;i++) {
			count=0;
			
			count=countRange(i);
			if(count==2) {
				System.out.println("prime number : "+i);
				if(large<i) {
					large=i;
				}
				
			}
			
			
		}
		System.out.println("largest prime number is "+large);
	}
	static int countRange(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		checkPrime();
	}

}
