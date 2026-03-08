package encapsulationExample;

class FaceBook{
	private int  pswd = 1234;
	public void setPswd(int pswd) {
		this.pswd=pswd;
	}
	
	public int getPswd() {
		return pswd;
	}

	
}

public class Example1 {
	public static void main(String[] args) {
		FaceBook fbBook=new FaceBook();
		System.out.println(fbBook.getPswd());
		fbBook.setPswd(786);
		System.out.println(fbBook.getPswd());
	}

}
