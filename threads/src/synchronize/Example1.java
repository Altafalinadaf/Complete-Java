package synchronize;


class Counter2{
    int count=2;
    
   void incrementCount() {
    	count++;
    }
}

class Demo extends Thread{
	Counter2 counter;
	Demo(Counter2 counter){
		this.counter=counter;
	}
	public void run() {
		for(int i=1;i<=1000;i++) {
			counter.incrementCount();
		}
	}
	
}


public class Example1 {
    public static void main(String[] args){
    	Counter2 counter=new Counter2();
        Demo d1=new Demo(counter);
        Demo d2=new Demo(counter);
       
        d1.start();
        d2.start();
        try {
        	d1.join();
        	d2.join();
        }
        catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
     
        System.out.println(counter.count);
        System.out.println("done");
    }

}
