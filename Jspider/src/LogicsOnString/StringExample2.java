package LogicsOnString;

public class StringExample2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str="marie@123 kannu@123 monica@123 rachel@123";
		System.out.println(str.replaceAll("123", "143"));
		
		
		String s1="mava1 athey2 rama3 pavan4";
		System.out.println(s1.replace("1", "9"));
		
		String s2="m6v6 6they7 r6m67 p6v6n7";
		System.out.println();
		
		
		String s4="mava athey rama pavan";
		System.out.println(str.replace("m", "java"));
				
	}
}
