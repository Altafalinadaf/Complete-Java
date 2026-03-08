package Day1;

import java.io.File;

public class Program1 {
	public static void main(String[] args) {
		File file=new File("C:\\JDBC\\file");
		boolean e=file.exists();
		System.out.println(e);
	}

}
