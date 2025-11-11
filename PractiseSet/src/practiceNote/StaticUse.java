package practiceNote;

class ParentClass{
	int a = 40;
	int b = 50;
}

public class StaticUse {
	static int a = 10;
	int b = 20 ;
	
	void access2() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void access3(StaticUse obj) {
		System.out.println(a);
		
		System.out.println(obj.b);
	}
	
	public static void main(String[] args) {
		StaticUse objStaticUse=new StaticUse();
		objStaticUse.access2();
		
		System.out.println(StaticUse.a);
		System.out.println(objStaticUse.b);
		access3(objStaticUse);
		ParentClass objParentClass=new ParentClass();
		System.out.println(objParentClass.a);
		System.out.println(objParentClass.b);
		
	}
}


