package Own_Class_OOPs_concepts;

class employee{
	int age;
	String name;
	int salary;
	public void printDetails() {
		System.out.println("My age is "+age);
		System.out.println("My name is "+name);
		System.out.println("My Salary is "+salary);
	}
	

}
public class Own_classs {
	
	
	public static void main(String[] args) {
		System.out.println("this is the own class");
		employee obj=new employee(); // Instantiating a new Employee Objects
		employee obj1=new employee();// Instantiating a new Employee Objects
		 
		// Setting Attributes for Altaf
		obj.age=22;
		obj.name="Altaf";
		obj.salary=50000;
		
		// Setting Attributes for Altaf
		obj1.age=18;
		obj1.name="AS";	
		obj1.salary=60000;
		
//		System.out.println(obj.id + " "+obj.name);
		obj.printDetails();
		obj1.printDetails();
		
		
	}

}
