package Constructors;

class Employee{
	private int id;
	private long salary;
	private String name;
	
	// overload the employee constructor to initialize the salary Rs. 10,000
	
	public Employee() {
		id=01;
		salary=10000;
		name="AliWithCoding";
	}
	
	public void setId(int i) {
		id=i;
	}
	public void setName(String n) {
		name=n;
	}
	public void setSalary(long l) {
		salary=l;
	}
	public int getId() {
		return id;
	}
	public String getNamae() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	
}

public class Overload_Constructor_Employee_Salary {
	public static void main(String[] args) {
		Employee ali=new Employee();
		System.out.println("id : "+ali.getId());
		System.out.println("Name : " +ali.getNamae());
		System.out.println("Salary : "+ali.getSalary());
		
		
	}

}
