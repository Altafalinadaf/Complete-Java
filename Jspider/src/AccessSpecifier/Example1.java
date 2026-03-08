package AccessSpecifier;

class Father{
	@SuppressWarnings("unused")
	private void atm() {
		System.out.println("Dad's ATM");
		
	}
	void car() {
		System.out.println("Dad's car");
	}
	protected void bike() {
		System.out.println("Dad's Bike");
		
	}
	public void cycle() {
		System.out.println("Dad's Cycle");
	}

}
public class Example1 {
	public static void main(String[] args) {
		Father f1=new Father();
	//	f1.atm(); // it will show error because we can't access private to class inside another class
		f1.car();
		f1.bike();
		f1.cycle();
		}
}

