package thread;

public class Example4 extends Thread{
	
	public void run() {
		System.out.println("Running ");
		
		
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Example4 thread=new Example4();  //new State
		System.out.println(thread.getState());
		thread.start(); //Runnable state and Runnig State also
		System.out.println(thread.getState());
		Thread.sleep(1000);
		System.out.println(thread.getState());
		thread.join();
		System.out.println(thread.getState());
		
		
	}

}
