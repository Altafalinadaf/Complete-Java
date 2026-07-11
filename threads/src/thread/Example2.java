package thread;

class Test extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {		
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}


class Test2 implements Runnable{
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}

public class Example2{
	public static void main(String[] args) {
		System.out.println("Thread Example ");
		
		
		Test2 test2=new Test2();
		Thread thread=new Thread(test2);
		thread.setPriority(10);
		thread.start();
		
		Test test=new Test();
		test.start();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(+Thread.currentThread().getPriority());
		}
	}

}
