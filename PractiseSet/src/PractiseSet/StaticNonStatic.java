package PractiseSet;

public class StaticNonStatic {

	String name = "Kartik";
	static String name2= "kartik2";
	
	public static void main(String[] args) {
		
		System.out.println(new StaticNonStatic().name);
		StaticNonStatic objNonStatic = new StaticNonStatic();
		objNonStatic.name="Sunil";
		System.out.println(objNonStatic.name);
		System.out.println(StaticNonStatic.name2);
		objNonStatic.name2="suni2";
		System.out.println(objNonStatic.name2);
		
		StaticNonStatic.name2="sunil3";
		System.out.println(StaticNonStatic.name2);
		
		StaticNonStatic objNonStatic2 = new StaticNonStatic();
		objNonStatic2.name2="me";
		System.out.println(objNonStatic2.name2);
		System.out.println(objNonStatic.name2);
		System.out.println(StaticNonStatic.name2);
	}

}
