package Basic.SimpleLogics;

public class Program4 {
	public static void main(String[] args) {
		int x;
		switch (x=1) {
		case 1: 
			System.out.println("hi ");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		/*
		 * switch (x=1) {
		case x>1: ecause Java does not allow us to compare values in the case statements.
		 An error occurred due to invalid switch statement is called Orphaned case error.
			System.out.println("hi ");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		 */
		
		
		
	}


}
