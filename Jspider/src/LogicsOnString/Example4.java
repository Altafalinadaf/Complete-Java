package LogicsOnString;

import java.util.Scanner;

public class Example4 {
	
	static int stringConvert(String name) {
		 String[] strings=name.split(" ");
//		 countJava(strings);
		// int x=countJava(strings); 
		 return countJava(strings); // 2
	}
	static int countJava(String[] strings) {
		int count=0;
		String s2="java";
		for(int i=0;i<strings.length;i++) {
	    	if(strings[i].equals(s2)) {
	    		count++;
	    	}
	    }
		return count; // 2
	}
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the String name : ");
	    String name=scanner.nextLine();
	    
	   // stringConvert(name,s2);
//	    int x=stringConvert(name);
//	    System.out.println(x);
	    
	    System.out.println(stringConvert(name));
	    scanner.close();
	    
	   
	   
	    
	    
	   
	    
	}

}
