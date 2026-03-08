package PolymorphismExamples;
class Book{
	void read() {
		System.out.println("Read some books");
	}
}

class Chemistry extends Book{
	void read() {
		System.out.println("Read Chemistry Book");
	}
}
class Physics extends Chemistry{
	void read() {
		super.read();
		System.out.println("Read Physics Book");
	}
}

public class Example1 extends Physics {
	static void study(Book e) {
		e.read();
	}
	public static void main(String[] args) {
		Book b1=new Book();
	    study(b1);
		//Chemistry c1=new Chemistry();
		//study(c1);
		Physics p1=new Physics();
		study(p1);
		
	}

}
