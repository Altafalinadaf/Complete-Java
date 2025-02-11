package PractiseSet;
interface Hlo{
	void disp();

}
class Sample1234 implements Hlo{
      public void disp() {
		System.out.println("hi");
	}
}

public class Program1223 {
	public static void main(String[] args) {
		Sample1234 s1=new Sample1234();
		s1.disp();
	}

}
