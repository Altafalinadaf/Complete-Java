package lamdaExpression;

interface BillPayment{
	void pay(double amount);
}

public class Example1 {
	public static void main(String[] args) {
		
//		Anonymous class 
		BillPayment upi=new BillPayment() {
			
			@Override
			public void pay(double amount) {
				System.out.println("Paying amount ");
				
			}
		};
		upi.pay(2000);
	
	}
	
	

}
