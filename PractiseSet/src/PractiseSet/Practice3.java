package PractiseSet;

// pass by references 

public class Practice3 {
		String food="Biryani";
		int price=130;
		int contity;
	
	static void tahajuddinHotel(Practice3 a1) {
		System.out.println("50Rs half plate "+a1.food);
	}
	static void rajkamalHotel(Practice3 a1) {
		System.out.println(a1.price+"Rs half plate birayani");
	}
	public static void main(String[] args) {
		Practice3 s1=new Practice3();
		tahajuddinHotel(s1);
		rajkamalHotel(s1);
		
	}

}
