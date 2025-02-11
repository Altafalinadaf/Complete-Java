package programs;
class Sampple{
     int a=10;
	
   void add() {
		int a=12;
		int b=12;
        int result=a+b;
        System.out.println(result);
	}
}
public class Practise1 {
	public static void main(String[] args) {
      new Sampple().add();
      System.out.println(new Sampple().a);
     
	}

}
