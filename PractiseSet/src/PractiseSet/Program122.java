package PractiseSet;

public class Program122 {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused") 
			int n=1/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handled");
		}
	}

}
