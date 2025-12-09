package threadExample;

class Counter{
	int count;
	
	synchronized void increment() {
		count++;
	}
}

class MyThread  implements Runnable{
	Counter counter;
	public MyThread(Counter counter) {
		// TODO Auto-generated constructor stub
		this.counter=counter;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
}

public class Example1 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		MyThread t1=new MyThread(counter);
		MyThread t2=new MyThread(counter);
		
		Thread thread=new Thread(t1);
		Thread thread2=new Thread(t2);
		
		thread.start();
		thread2.start();
		
		System.out.println(counter.count);
		
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final count " + counter.count);
		
	}

}
