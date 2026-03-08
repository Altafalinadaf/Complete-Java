package exceptionHandling;

class ATMException extends Exception{
	String msg;
	public ATMException(String msg) {
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg; 
	}
}

class ATM{
	double bal = 1000;
	void withdrow(double amount) throws ATMException {
		if(amount<=bal) {
			System.out.println("Successfully withdraw the amount "+amount);
			System.out.println("The Balance is "+(bal-amount));
		}
		else {
			throw new ATMException("Insuffient Balance");
		}
		
	}
}

public class Example4 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		try {
			atm.withdrow(200);
		}
		catch (ATMException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
