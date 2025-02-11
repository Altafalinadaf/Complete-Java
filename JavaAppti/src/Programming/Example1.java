package Programming;
class Super{
	public void disp() { // if a write private void disp() then it will not show error 
		System.out.println("SuperClass");
		
	}
}
class SubClass extends Super{
	public  void disp() {
		System.out.println("SubClass");
	}
}


public class Example1 {
	public static void main(String[] args) {
		Super super1=new Super();
     	super1.disp();
		
		SubClass s1= new SubClass();
		s1.disp();
		
	}

}
