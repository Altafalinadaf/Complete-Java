package PractiseSet;

public class Encapsulation {
	private String pswd="Hello@123";
	
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String Pswd) {
		this.pswd=Pswd;
	}
	public static void main(String[] args) {
		Encapsulation s1=new Encapsulation();
		System.out.println(s1.getPswd());
		s1.setPswd("ALi@123");
		System.out.println(s1.getPswd());
		
	}

}
