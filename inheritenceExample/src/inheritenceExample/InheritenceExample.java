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
	static void deposite() {
		System.out.println("Deposite");
	}
	
	
}

class SavingAccount extends OpeningAccount{
	public SavingAccount(String name, long phno, int age, String city) {
		super(name, phno, age, city);
		// TODO Auto-generated constructor stub
	}

	void disp() {
		SavingAccount.deposite();
	}
}



public class InheritenceExample {
	public static void main(String[] args) {
		
	}
}
