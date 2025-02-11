package Basic;
/*
 * 20 and 1.34f will be added and then 21.34 will be concatenated with “A” and “B”, hence output will be 21.34AB.
 */
public class Example4 {
	public static void main(String[] args) {
		System.out.println(10+21.43+'A'+"A"+"B");
        System.out.println('A'+10+"A");
        
        
        int x=10;
        int y=20;
        boolean result=false; // if it is int result; result=(b>=a_ soup(result); output is error
        result=(y>=x);        //Consider the expression result=(b>=a); here value of b is largest from a, 
        //result=(int)(y>=x);
        System.out.println(result); //True will return, and true (boolean) can not assign into integer variable
        
        /*int x1=10;
        int y1=20;
        int result;
        result=(int)(b>=a);
       ** we cannot convert int to boolean and boolean to int**
       *
       *
       *
       * int a=0;
         System.out.print((a==true)? "Hello": "Hi");
         ERROR: The operator == is undefined for the argument type(s) char, boolean.

         In Java programming Language, Operator == will work with true/false (boolean values) 
         and here a is not a boolean value. Hence ERROR will be occurred.
        */
        
        
	}

}
