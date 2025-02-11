package ThreadingConcepts;
// we can override the run() in 2 ways
// 1) by extending the Thread class
// 2) by implementing the Runnable interface
//class Sample2 implements Runnable{
class Sample2 extends Thread{
	public void run() {
		System.out.println("Hi");
	}
	// even though if we not write then also its take by default 
	// we have to call the start() in start() we have the the run() it take automatically we just need to call the start()
	// even we can call run() also or start method
//	public void start() {
//		run();
//	}
}

public class Program2 {
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		Thread t1=new Thread(s1);
		t1.run();
	}
}
