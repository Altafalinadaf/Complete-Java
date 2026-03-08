package inputnumber;
import java.util.Scanner;

public class input1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong();
		boolean b=sc.nextBoolean();
		short s=sc.nextShort();
		byte by=sc.nextByte();
		System.out.println("Long " + l); // 8 bytes
		System.out.println("Boolean " + b); //1 bit
		System.out.println("Short " + s); // 2 bytes
		System.out.println("Byte " + by); // byte
		sc.close();
	}

}
