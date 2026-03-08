package functionaLInterface;

@FunctionalInterface
interface Payment2{
	void pay(double amount);
	
	
	default void refund(double amount) {
		System.out.println("Refund amount ");
	}
	
	static void disp() {
		System.out.println("Amount is paid ");
	}
	
	
}

class CreditCard2 implements Payment2{
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" through CreditCard");
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("refund with 200 rupees credit card charges "+(amount-200));	
	}


}
public class Example2 {
	public static void main(String[] args) {
		
		Payment2 payment=new CreditCard2();
		payment.pay(4000);
		Payment2.disp();
		
		payment.refund(1000);
	}

}
