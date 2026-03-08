package Method_OverRiding;

class Ola_v1{
	void ride() {
		System.out.println("ride with cab");
	}
}

class Ola_v2{
	void ride() {
		System.out.println("ride with cab,auto");
	}
}

public class Method_OverRindding2 {
	
	public static void main(String[] args) {
		Ola_v2 objOla_v2=new Ola_v2();
		objOla_v2.ride();
		
	}

}
