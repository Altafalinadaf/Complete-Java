package ThreadingConcepts;

class Sample5 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);		
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
class Sample6 extends Thread{
	public void run() {
		for(int i=101;i<=110;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}

public class Program3 {
	public static void main(String[] args) {
		Sample5 s1=new Sample5();
		Thread th1=new Thread(s1);
		th1.start();
		
		Sample6 s2=new Sample6();
		Thread th2=new Thread(s2);
		th2.start();
	}

}
