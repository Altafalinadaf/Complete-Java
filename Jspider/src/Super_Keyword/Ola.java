package Super_Keyword;
 class Ola_v1{
	 void ride() {
		 System.out.println("Ride with Cab");
	 }
 }
 
 class Ola_v2 extends Ola_v1{
	 void ride() {
		 super.ride();
		 System.out.println("Ride with Auto ,Car");
	 }
 }

public class Ola {
	public static void main(String[] args) {
		Ola_v2 objOla_v2=new Ola_v2();
		objOla_v2.ride();
	}

}
