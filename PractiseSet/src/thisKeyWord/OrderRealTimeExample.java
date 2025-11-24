package thisKeyWord;

class Order {
	int orderId;
	double amount;
	
	public Order(int orderId,double amount) {
		this.orderId=orderId;
		this.amount=amount;
	}
	
	void orderDetails() {
		System.out.println("Order id = "+orderId);
		System.out.println("Order amount = "+amount);
	}
	
	void orderProcess() {
		System.out.println("Order is processing ");
	}
	
}

class OnlineOrder extends Order{
	double deliveryCharge=50.0;
	public OnlineOrder(int orderId,double amount) {
		// TODO Auto-generated constructor stub
		super(orderId, amount);
		
	}
	
	void orderProcess() {
		super.orderProcess();
		System.out.println("delivery charge is = "+deliveryCharge);
		System.out.println("Total amount is = "+(deliveryCharge+amount));
	}
	
	void show() {
		System.out.println("Delivered within 2 working days");
	}
}


public class OrderRealTimeExample {
	public static void main(String[] args) {
		OnlineOrder order=new OnlineOrder(121, 2000);
		order.orderDetails();
		order.orderProcess();
		order.show();
	}

}
