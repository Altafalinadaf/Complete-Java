package thread;

class A implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Runnable interface ");
		}
	}
}


class B extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			
			System.out.println("Thread Class ");
		}
	}
}


public class Example3 {
	public static void main(String[] args) {
		B b=new B();
		b.start();
		A a=new A();
		Thread thread=new Thread(a);
		thread.start();
		
	}

}
