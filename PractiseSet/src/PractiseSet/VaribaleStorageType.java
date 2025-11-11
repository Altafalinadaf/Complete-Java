package PractiseSet;



public class VaribaleStorageType {
	static {
	    {
			System.out.println("Helo");
			{
				int a = 10;
				{
					System.out.println(a);
				}
			}
		}
	}
	static char a ;
	public static void main(String[] args) {
		
		byte a = 127;
		byte b = -128;
		System.out.println(a+" "+b);
		
		short c = -32768;
		short d = 32767;
		System.out.println((int)VaribaleStorageType.a);
		System.out.println(VaribaleStorageType.a);
	}

}
