package practice;

class BankAccount{
	int balance;
	
	synchronized void credit(int amount) {
		balance+=amount;
		System.out.println("Successfully credited amount = "+amount+ " from user = "+Thread.currentThread().getName());
		System.out.println("Balanace is = "+balance);
	}
	
	synchronized void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Successfully debited amount = "+amount+ " from user = "+Thread.currentThread().getName());
			System.out.println("Balance is = "+balance);
		}
		else {
			System.out.println("Insuffient amount  "+amount +" " + Thread.currentThread().getName());
		}
	}
}

class User extends Thread{
	BankAccount bankAccount;
	String operation;
	int amount;
	
	public User(BankAccount bankAccount,String operation,int amount) {
		// TODO Auto-generated constructor stub
		this.bankAccount=bankAccount;
		this.operation=operation;
		this.amount=amount;
	}
	
	public void run() {
		if(operation.equals("credit")) {
			bankAccount.credit(amount);
		}
		
		else if(operation.equals("withdraw")) {
			bankAccount.withdraw(amount);
		}
		
	}
	
}
public class Example1 {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		
		User user1=new User(bankAccount, "credit", 3000);
		User user2 =new User(bankAccount, "withdraw", 2000);
		User user3=new User(bankAccount, "credit", 600);
		User user4=new User(bankAccount, "withdraw", 6000);
		
		user1.setName("user 1");
		user2.setName("user 2");
		user3.setName("user 3");
		user4.setName("user 4");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
		
		
	}

}
