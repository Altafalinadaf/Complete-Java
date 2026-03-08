package methodsarguments;public class Method_Variable_Arguments {
	
	static int sum(int ...arr) {
		// arr is available here as int[] arr
		int result=0;
		for(int a:arr) {
			result +=a;
			
		// insted of creating n time arguments and passing we can create the int "...arr" that can create automatically arguments 	
		}
		return result;
	}
	public static void main(String args[]) {
		System.out.println("the sum of 4 and 5 is : "+sum(4,5));
		System.out.println("The sum of 4,5 and 6 is : "+sum(4,5,6));
		System.out.println("The sum of 4,5 ,6 and 7 is : "+sum(4,5,6,7));
		
		
	}

}
