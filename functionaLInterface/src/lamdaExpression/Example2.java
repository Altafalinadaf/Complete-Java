package lamdaExpression;

interface Payment{
	void pay(double amount);
}

public class Example2 {
	public static void main(String[] args) {
//		Lambda Expressions 
		Payment upi= amount -> System.out.println("Paying amount through UPI " +amount);
		
		upi.pay(6000);
	}
}
