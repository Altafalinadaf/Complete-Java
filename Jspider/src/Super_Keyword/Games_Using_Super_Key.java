package Super_Keyword;

class Car_racing {
	void play() {
		System.out.println("Playing with Computer ");
	}
}

class Car_racing_v2 extends Car_racing{
	void play() {
		super.play();
		System.out.println("Playing with Online with Friends");
	}
}

public class Games_Using_Super_Key {
	public static void main(String[] args) {
		Car_racing_v2 objCar_racing_v2=new Car_racing_v2();
		objCar_racing_v2.play();
		
	}

}
