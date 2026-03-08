package methods;
class Area{
	int a=10;
	void Circle() {
		int r=10;
		double pi=3.142;
		 double area=r*r*pi;
		 System.out.println(area);
	}

}

public class methods_Non_static_access {
	
	public static void main(String[] args) {
	  int x=new Area().a;
	  System.out.println(x);
		new Area().Circle();
	}

}
