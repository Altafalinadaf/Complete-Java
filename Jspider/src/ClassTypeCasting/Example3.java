package ClassTypeCasting;
class Tester {
	int r=10;
}

class Tista extends Tester{
	void uliya() {
		System.out.println("Hi i uliya");
	}
}
public class Example3 {
	public static void main(String[] args) {
		Tester t1=new Tista();
		System.out.println(t1.r);
		Tista t2=(Tista)t1;
		t2.uliya();
		System.out.println(t2.r);
	}

}
