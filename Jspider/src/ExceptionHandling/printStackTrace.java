package ExceptionHandling;


public class printStackTrace {
	static void disp3() {
		int arr[]= {1,23,43,53};
		System.out.println(arr[9]);
	}
	static void disp2() {
		disp3();
	}
	static void disp1() {
		disp2();
	}
	public static void main(String[] args) {
		try {
			disp1();
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Handle");
			e.printStackTrace();  // non static method of throwable class 
			                  //it will print complete back tace of the exception which is store in system.err
		}
		
		
	}

}
