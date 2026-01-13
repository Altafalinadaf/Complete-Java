package synchronize;

class BankAccount{
	int balance;
	
	BankAccount(){
		System.out.println("Printed because of Super() keywords");
	}
	
	synchronized void withdraw(int amount){
		if(balance>=amount) {
			System.out.println("Thread name = "+Thread.currentThread().getName()+" withdraw = "+amount);
			balance -=amount;
			System.out.println("total balance = "+balance);
		}
		else {
			System.out.println("Insiffient Balance ");
		}
	}
}


class User extends Thread{
	
	BankAccount bankAccount;
	
	public User(BankAccount bankAccount) {
		// TODO Auto-generated constructor stub
		super();
		this.bankAccount=bankAccount;
		
		
	}
	public void run() {
		bankAccount.withdraw(3000);
	}
}
public class RealTimeExampleSyncronize {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		bankAccount.balance=6000;
		
		User user1=new User(bankAccount);
		User user2=new User(bankAccount);
		
		user1.setName("user1");
		user2.setName("User2");
		
		user1.start();
		user2.start();
		
		
		
	}
}
