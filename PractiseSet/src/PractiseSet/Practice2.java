package PractiseSet;

// pass by reference 
// add class ref variable passing to sub class that sub class can access without creating the one more object

class add{

	int disp() {
		int x=10;
		int b=20;
		return x+b;
	}
	
}
class sub{
	void disp1(add a1) {
		int x=11;
		int x1=a1.disp();;
		System.out.println(x+x1);
	
	}
}

public class Practice2 {
	public static void main(String[] args) {
		add a1=new add();
		System.out.println(a1.disp());
		sub s1=new sub();
		s1.disp1(a1);
		
		
	
	}
	

}
