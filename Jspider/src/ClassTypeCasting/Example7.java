package ClassTypeCasting;
class Cola1{
	int f=10;
}
class chungacha extends Cola1{
	int d=10;
}
public class Example7 {
	public static void main(String[] args) {
		Cola1 cola1=new chungacha();
		System.out.println(cola1.f);
		chungacha c1=(chungacha)cola1;
		System.out.println(c1.d);
	}

}
