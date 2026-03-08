package ExceptionHandling;
@SuppressWarnings("serial")
class PasswordException extends Exception{  // over ridden the exception class 
	String mes;
	PasswordException(String mes){
		this.mes=mes;
	}
	public String getMes() {
		return mes;
	}
}

public class Program4 {
	static void passwordVerification()throws PasswordException{
		
		int length=7;
		if(length>=6) {
			System.out.println("Strong passWord");
		}
		else if(length>=4) {
			System.out.println("Week password");
		}
		else {
			throw new PasswordException("Your passwords should cantain maximum 6 characater or minimum 4 char");
		}
	}
	
	public static void main(String[] args) {
		try {
			passwordVerification();
		} catch (PasswordException e1) {
			// TODO: handle exception
			System.out.println(e1.getMes());
		}
	}

}
