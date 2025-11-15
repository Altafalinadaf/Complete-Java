package interfaceExample;

interface Payments{
	void pay(double amount);
}


class UPI implements Payments{
	public void pay(double amount) {
		System.out.println("Paid "+ amount +" by using UPI");
	}
}

class CreditCard implements Payments{
	public void pay(double amount) {
		System.out.println("Paid "+amount+" by using Credit Card");
	}
}
public class Example2 {
	public static void main(String[] args) {
		Payments p1=new UPI();
		Payments p2 =new CreditCard();
		p1.pay(30000.0);
		p2.pay(50000);
	}
	

}
