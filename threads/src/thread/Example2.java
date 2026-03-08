package thread;

class Test extends Thread{
	public void run() {
		for(int i=0;i<=20;i++) {
		
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}


class Test2 implements Runnable{
	public void run() {
		for(int i=0;i<=20;i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			Thread.currentThread().setPriority(10);
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}

public class Example2{
	public static void main(String[] args) {
		System.out.println("Thread Example ");
		
		Test test=new Test();
		test.start();
		
		Test2 test2=new Test2();
		Thread thread=new Thread(test2);
		thread.start();
		
		for(int i=0;i<=20;i++) {
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(+Thread.currentThread().getPriority());
		}
	}

}
