package realtimeExample;

class Employee{
	String empName;
	int empAge;
	double empSal;
	
	public Employee(String empName,int empAge,double empSal) {
		// TODO Auto-generated constructor stub
		this.empName=empName;
		this.empAge=empAge;
		this.empSal=empSal;
	}
	
	void empDetails() {
		System.out.println("Emp Name = "+empName);
		System.out.println("Emp Age = "+empAge);
		System.out.println("Emp Salary = "+empSal);
	}
	
	double calculateSal() {
		return empSal;
	}
	
}

class FullTimeEmp extends Employee{
	double bonus;
	double allowance;
	
	public FullTimeEmp(String empName,int empAge,double empSal,double bonus,double allowance) {
		// TODO Auto-generated constructor stub
		super(empName, empAge, empSal);
		this.allowance=allowance;
		this.bonus=bonus;
	}
	
	double calculateSal() {
		return empSal+bonus+allowance;
	}
	
	
}

class PartTimeEmp extends Employee{
	int hours;
	double ratePerHours;
	
	public PartTimeEmp(String empName,int empAge,int hours,double ratePerHours) {
		// TODO Auto-generated constructor stub
		super(empName, empAge, 0);
		this.hours=hours;
		this.ratePerHours=ratePerHours;
	}
	
	double calculateSal() {
		return hours*ratePerHours;
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		FullTimeEmp fullTimeEmp=new FullTimeEmp("Ali", 24, 40000, 5000, 2000);
		fullTimeEmp.empDetails();
		System.out.println(fullTimeEmp.calculateSal());
		
		PartTimeEmp partTimeEmp=new PartTimeEmp(null, 0, 0, 0)
		
	}

}
