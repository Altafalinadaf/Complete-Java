class BankAccount{
    private int balance;

    BankAccount(int balance){
        if(balance>0){
            this.balance=balance;
        }
    }



    void deposite(int amount){
        balance +=amount;
        System.out.println("Successfully deposited = "+balance);
    }
    public void withdraw(int amount){
        if(balance>=amount){
            System.out.println(amount+" withdraw successflly ");
            balance-=amount;
        }
        else{
            System.out.println("Insuffient balance ");
        }
    }


    public int sendBalance(){
        return balance;
    }
}

public class Example1 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(2000);

        bankAccount.withdraw(1000);

        bankAccount.deposite(500);
        System.out.println(bankAccount.sendBalance());



    }
}
