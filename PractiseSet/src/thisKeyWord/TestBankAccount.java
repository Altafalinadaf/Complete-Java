package thisKeyWord;

import java.util.Scanner;

class BankAccount{
	double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
		
	}
	
	void displayBalance() {
		System.out.println("bank balance is = "+balance);
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn amount = "+amount);
			
		}
		else {
			System.out.println("insuffient balanae ");
		}
		
	}
	
	void credit(double amount) {
		balance+=amount;
		System.out.println(amount+" Credited");
	}
}

class SavingAccount extends BankAccount{
	SavingAccount(double balance){
		super(balance);
		System.out.println("SavingAccount Created");
	}
	
	void withdraw(double amount) {
		
		super.withdraw(amount);
	}
	
	void show() {
		
		super.displayBalance();
	}
	
	void credit(double amount) {
		super.credit(amount);
	}
}
public class TestBankAccount {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		SavingAccount savingAccount=new SavingAccount(1000.0);
		savingAccount.show();
		
		while(true) {
			System.out.println("Welcome to ATM\n1. Credit\n2. Withdrawn\n3. Balance\n4. Exit ");
			int n = scanner.nextInt();
			
			if(n==1) {
				System.out.println("how much amount you want to credit = ");
				int amount = scanner.nextInt();
				savingAccount.credit(amount);
			}
			else if(n==2) {
				System.out.println("how much amount you want to debit = ");
				int amount=scanner.nextInt();
				savingAccount.withdraw(amount);
				
			}
			else if(n==3){
				savingAccount.show();
			}
			
			else if(n==4) {
				break;
			}
			
			else {
				System.out.println("Please choose the correct option");
			}
		}
	}

}
