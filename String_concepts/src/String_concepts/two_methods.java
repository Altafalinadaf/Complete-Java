package String_concepts;
public class two_methods {
	public static void main(String args[]) {
		String str="harry";
		String str2="harry";
		System.out.println(str==str2);
		//str already have harry and now str2 also creating harry then it not create one more harry 
		// it directly refer to the harry instead of creating harry
		
		// by using the new,we create new objects
		String str3=new String("keep coding");
		String str4=new String("keep coding");
		System.out.println(str3==str4);
		// here we create new because of that we can create 2 different keep coding 
		
		
		System.out.println(str.length());// length of str..
		System.out.println(str.toLowerCase());// to lowercase
		System.out.println(str.toUpperCase());
		
        System.out.println(str.substring(2)); // print from index 2 to end (harry)
        
        System.out.println(str.substring(0,2)); // print ha
        
        System.out.println(str.replace('r','p'));
        
        System.out.println(str.charAt(3)); //r
        
        System.out.println(str.indexOf('r')); //2
        
        System.out.println(str.lastIndexOf('r'));//3
        
        System.out.println(str.equals("harry")); //true
        
    
        
		
		
	}

}
