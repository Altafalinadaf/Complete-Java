package Abstraction;
interface Animal{
	void noise();
	
}
class Dog implements Animal{
	public void noise() {
		System.out.println("bow bow ");
	}
}
class cat implements Animal{
	public void noise() {
		System.out.println("Mew mew");
	}
}


public class Program {
	static void Simulator(Animal a) {
		a.noise();
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		cat c1=new cat();
		Simulator(d1);
		Simulator(c1);
	}

}
