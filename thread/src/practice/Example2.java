package practice;

class BankAccount{
    int balance;
	
	synchronized void credit(int amount) {
		System.out.println("successfully Credit amount = "+amount+" from "+Thread.currentThread().getName());
		balance+=amount;
		System.out.println("balance = "+balance);
	}
	
	synchronized void withdraw(int amount) {
		if(balance>=amount) {
			System.out.println("successfully debit amount = "+amount+" from "+Thread.currentThread().getName());
			balance-=amount;
			System.out.println("balance = "+balance);
		}
		else {
			System.out.println("Insuffient balance from "+Thread.currentThread().getName());
			System.out.println("balance = "+balance);
		}
	}
}

class ATM extends Thread{
	BankAccount bankAccount;
	String operation;
	int amount;
	
	ATM(BankAccount bankAccount,String operation,int amount){
		this.bankAccount=bankAccount;
		this.operation=operation;
		this.amount=amount;
		
		
	}
	
	public void run() {
		if(operation.equals("withdraw")) {
			bankAccount.withdraw(amount);
		}
		else {
			bankAccount.credit(amount);
		}
	}
}

class UPI extends Thread{
	BankAccount bankAccount;
	String operation;
	int amount;
	
	UPI(BankAccount bankAccount,String operation,int amount){
		this.bankAccount=bankAccount;
		this.operation=operation;
		this.amount=amount;
		
		
	}
	
	public void run() {
		if(operation.equals("withdraw")) {
			bankAccount.withdraw(amount);
		}
		else {
			bankAccount.credit(amount);
		}
	}
}

class NetBanking extends Thread{
	BankAccount bankAccount;
	String operation;
	int amount;
	
	NetBanking(BankAccount bankAccount,String operation,int amount){
		this.bankAccount=bankAccount;
		this.operation=operation;
		this.amount=amount;
		
		
	}
	
	public void run() {
		if(operation.equals("withdraw")) {
			bankAccount.withdraw(amount);
		}
		else {
			bankAccount.credit(amount);
		}
	}
}

class BankTeller extends Thread{
	BankAccount bankAccount;
	String operation;
	int amount;
	
	BankTeller(BankAccount bankAccount,String operation,int amount){
		this.bankAccount=bankAccount;
		this.operation=operation;
		this.amount=amount;
		
		
	}
	
	public void run() {
		if(operation.equals("withdraw")) {
			bankAccount.withdraw(amount);
		}
		else {
			bankAccount.credit(amount);
		}
	}
}
public class Example2 {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		
		ATM atm=new ATM(bankAccount, "credit", 10000);
		atm.setName("ATM");
		
		UPI upi=new UPI(bankAccount, "withdraw", 1000);
		upi.setName("UPI");
		
		NetBanking netBanking=new NetBanking(bankAccount, "withdraw", 5000);
		netBanking.setName("NetBanking");
		
		BankTeller bankTeller=new BankTeller(bankAccount, "credit", 100);
		bankTeller.setName("BankTeller");
		
		atm.start();
		upi.start();
		netBanking.start();
		bankTeller.start();
	}
	

}
