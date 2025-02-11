package Day2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\cprogramsgithub\\cprogram\\array_test.o");
		
		try (FileReader fReader = new FileReader(file)) {
			char[] arr=new char[(int)file.length()];
			fReader.read(arr);
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
