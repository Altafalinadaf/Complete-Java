package PractiseSet;


class Animal{
	void sound() {
		System.out.println("Some Noise");
	}

}
class dog extends Animal{
	void sound() {
		System.out.println("Dog noise");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("Cat noise");
	}
}

class snake extends Animal{
	void sound() {
		System.out.println("Snake Noise");
	}
}
class Simulator{
	static void someSound(Animal a1) {
		a1.sound();
		
	}
}

public class Practise {
	
	public static void main(String[] args) {
		dog d1=new dog();
		cat c1=new cat();
		snake s1=new snake();
		Simulator.someSound(s1);
		Simulator.someSound(c1);
		Simulator.someSound(d1);
		
	}

}
