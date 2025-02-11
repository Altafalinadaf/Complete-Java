package methods;

public class changeofarrray {
	static void change(int[] arr) {
		arr[0]=98;
	}
	public static void main( String args[]) {
		int[] marks= {84,58,45,85,89,56};
		change(marks);
		System.out.println(marks[0]);
	}

}
