package methods;

public class overloading {
	// method overloading 
	static void san() { // no argument passing 
		System.out.println("hi you are so adorable");
	}
	static void san(int a) { // argument int a is passing
		System.out.println("hi it's me "+a+" Bro");
	}
	public static void main(String args[]) {
		san();
		san(1);
		san(500); // argument are actual means a actual value
		
		//both san() and san() is same methods but second san is passing the argument int a san(int a)
		
		// static void main(int a) =int a is a parameter
		// san(3000) the value is the agrument(3000)
	}

}
