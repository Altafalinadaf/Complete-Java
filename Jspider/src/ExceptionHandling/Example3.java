package ExceptionHandling;

public class Example3 {
	public static void main(String[] args) {
		int arr[]= {1,23,43,53};
		try {
			System.out.println(arr[9]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Handled.......");
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught.........");
		}
	}
	

}
