package threadExample;

class Demo extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}

class Test implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(5*i);
		}
	}
}



public class TestSingleThread {
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.start();
		
		Thread thread=new Thread(new Test());
		thread.start();
		
	}

}
