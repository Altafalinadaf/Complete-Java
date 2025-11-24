package superKeyword;

class Whatsapp{
	void message() {
		System.out.println("just text message ");
	}
}

class WhatsappV2 extends Whatsapp{
	void message() {
		super.message();
		System.out.println("text with imogi");
	}
	
	void status() {
		System.out.println("we can see status");
	}
	
}

public class Example2 {
	public static void main(String[] args) {
		WhatsappV2 whatsappV2=new WhatsappV2();
		whatsappV2.message();
		
	}

}
