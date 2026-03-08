package oops1;
class Employee{
	  int id;
	  int salary;
	  String name;
	  public void printDetails(){
	      System.out.println("My id is : " + id);
	      System.out.println("and my name is : "+ name);
	      System.out.println("my salarrrrry is : "+ salary);
	  }
	 // use for directly getting the salary by using the getSalarry function 
	  public int getSalary(){
	      return salary;
	  }
	  public int getId() {
	  	return id;
	  }
	}

public class employee2 {
	public static void main(String[] args) {
	      System.out.println("This is our custom class");
	      Employee harry = new Employee(); // Instantiating a new Employee Object
	      Employee john = new Employee(); // Instantiating a new Employee Object

	      // Setting Attributes for Harry
	      harry.id = 12;
	      harry.salary = 34;
	      harry.name = "CodeWithHarry";

	      // Setting Attributes for John
	      john.id = 01;
	      john.salary = 100000;
	      john.name = "Altaf Ali";

	      // Printing the Attributes what we written in the printDetails class 
	      harry.printDetails();
	      john.printDetails();
	      
	      // used to getting the values by using get method
	      int salary = john.getSalary();
	      int id=john.getId();
	      System.out.println(salary);
	      System.out.println(id);
	      System.out.println(harry.id);
	      System.out.println(harry.name);
	  }
	

}
