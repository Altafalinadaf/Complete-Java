package Method_OverRiding;

class Whatsapp_v1{
	void status() {
		System.out.println("Text with status");
	}
}
class Whatsapp_v2 extends Whatsapp_v1{
	void status() {
		// super keyword used for showing the implementation of Super class 
		super.status();
		System.out.println("Text with status, image");
	}
}

public class Method_OverRidding1 {
	public static void main(String[] args) {
		Whatsapp_v2 objV2=new Whatsapp_v2();
		objV2.status();
	}
}
