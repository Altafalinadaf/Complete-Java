package Basic;
	/*
	 * Here, ‘A’ and ‘B’ are not strings they are characters. ‘A’ and ‘B’ will not concatenate.
	 * The Unicode of the ‘A’ and ‘B’ will add. The Unicode of ‘A’ is 65 and ‘B’ is 66. Hence Output will be 131.
	 */
public class Example1 {
	public static void main(String[] args) {
		System.out.println('A'+'B');
		System.out.println("A"+"B");
	}

}
