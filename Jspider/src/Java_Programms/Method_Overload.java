package Java_Programms;

public class Method_Overload {
	
	static void insta(int pswd,String id) {
		System.out.println("Insta id = "+id+"\nPassword = "+pswd);
		System.out.println("**********************************************");
	}
	
	static void insta(String post,String Video) {
		System.out.println("Insta post = "+post+"\nInsta video = "+Video);
		System.out.println("**********************************************");
	}
	static void insta(String send,int size) {
		System.out.println("insta video = "+send+"\nSize of video = "+size);
		System.out.println("**********************************************");
	}
	
	public static void main(String[] args) {
		insta(1234, "altafali");
		insta("MyImage","MyVideo" );
		insta("ComedyReels", 3);
	}

}
