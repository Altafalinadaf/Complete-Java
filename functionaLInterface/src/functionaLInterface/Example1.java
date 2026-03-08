package functionaLInterface;


interface Payment{
	void pay(double amount);
}

class UPI implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" through UPI");
	}
}

class CreditCard implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" through CreditCard");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Payment payment=new UPI();
		payment.pay(3000);
		
		Payment creditCard=new CreditCard();
		creditCard.pay(7000);
	}

}
