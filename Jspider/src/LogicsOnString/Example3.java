package LogicsOnString;

public class Example3 {
	public static void main(String[] args) {
		String string="hello java hi java how are you java ";
		
		String[] strings=string.split(" "); //converting from String type to array type;
		String string2="java";
		
		int count =0;
		for(int i=0;i<strings.length;i++) {
			if(strings[i].equals(string2)) {
				count++;
			}
		}
		System.out.println("java " +count);
//		int num=10;
//		
//		int arr[]=new int[num];
//		for(int i=0;i<arr.length;i++) {
//			
//		}
	}


}
