package thisKeyWord;

class Demo{
	Demo(){
		System.out.println("default constructor");
		
	}
	
	Demo(String name){
//		this() keywords calls to the constructor which has no parameter 
		this();
		System.out.println("name = "+name);
	}
	Demo(int age){
//		when we use this() keyword it will call to the parent constructor
//		this will always referes to current object 
		this("ali");
		System.out.println("age is "+age);
	}
}

public class Example2 {
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo);
//		here we are using this keyword
		Demo demo2=new Demo(23);
		Demo demo3=new Demo(24);
	}

}
