package inheritenceExample;

class OpeningAccount{
	String name;
	long phno;
	int age;
	String city;
	
	public OpeningAccount(String name,long phno,int age,String city) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phno=phno;
		this.age=age;
		this.city=city;
		
	}
	
	
	
}

class SavingAccount extends OpeningAccount{

	public SavingAccount(String name, long phno, int age, String city) {
		super(name, phno, age, city);
		// TODO Auto-generated constructor stub
	}
	
	{
		System.out.println("Saving account is opened");
	}
	
	void dispInfor() {
		System.out.println("Name = "+name+"\n"+"Phone = "+phno+"\n"+"Age = "+age+"\n"+"City = "+city);
	}
	
	


}

class CurrentAccount extends OpeningAccount{

	public CurrentAccount(String name, long phno, int age) {
		super(name, phno, age, "default value");
		// TODO Auto-generated constructor stub
	}
	{
		System.out.println("Current account is opened");
	}
	void dispInfor() {
		System.out.println("Name = "+name+"\n"+"Phone = "+phno+"\n"+"Age = "+age);
	}
	
}



public class InheritenceExample {
	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount("Raj", 78529631, 24, "Gulbarga");
		savingAccount.dispInfor();
		
		CurrentAccount currentAccount=new CurrentAccount("Raj", 78529631, 24);
		currentAccount.dispInfor();
	}
}
