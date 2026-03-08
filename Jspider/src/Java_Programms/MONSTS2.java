package Java_Programms;

public class MONSTS2 {
	void insta(int pswd,String id) {
		System.out.println("Insta id = "+id+"\nPassword = "+pswd);
		System.out.println("**********************************************");
	}
	
	 void insta(String post,String Video) {
		System.out.println("Insta post = "+post+"\nInsta video = "+Video);
		System.out.println("**********************************************");
	}
	 void insta(String send,int size) {
		System.out.println("insta video = "+send+"\nSize of video = "+size);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		MONSTS2 objMonsts2=new MONSTS2();
		objMonsts2.insta(1234, "altafali");
		objMonsts2.insta("MyImage","MyVideo" );
		objMonsts2.insta("ComedyReels", 3);
	}

}
