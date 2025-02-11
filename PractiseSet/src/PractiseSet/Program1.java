package PractiseSet;
class Sample31{
	void disp() {
		System.out.println("Its a upcasting ");
	}
}
class Sample2 extends Sample31{
    public void disp() {
    	System.out.println("Its a downcasting ");
    }
}

public class Program1 {
	public static void main(String[] args) {
		Sample31 obj=new Sample2(); // here we are up casting then also we are getting the down casting implementation 
		                            // because we are override the class that's why we are getting that output of sub class 
		                       // even though we up casting but we will get the output of sub class because of overriding the class
		obj.disp();
		
	}

}
