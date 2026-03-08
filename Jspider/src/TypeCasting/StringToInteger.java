package TypeCasting;

public class StringToInteger {
	static int sum(String n) {
		int a=Integer.parseInt(n);
		System.out.println("convert the String '1234' type to integer type : "+a);
		
		return add(a);
	}
	static int add(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		String string="1234";
		int x=sum(string);
		System.out.println("The sum of 1234 is "+x);
		
	}

}
