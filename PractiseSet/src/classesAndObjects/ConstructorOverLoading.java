package classesAndObjects;

class Student{
	String name="ABC";
	int age=20;
	
	Student(){
		System.out.println("Name = "+name+"\n"+"Age = "+age);
	}
	
	Student(String  name){
		System.out.println("Name = "+name+"\n"+"Age = "+age);
		this.name=name;
	}
	
	Student(int age){
		System.out.println("Name = "+name+"\n"+"Age = "+age);
	}
	
	Student(String name,int age){
		System.out.println("Name = "+name+"\n"+"Age = "+age);
	}
}
public class ConstructorOverLoading {
	static {
		System.out.println("Students Details");
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Ali");
		Student s3=new Student(24);
		
	}

}
