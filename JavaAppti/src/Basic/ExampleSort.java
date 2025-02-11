package Basic;

public class ExampleSort {
   @SuppressWarnings("unused")
public static void main(String[] args) {
	final int a=10;
	// const int a=10 -> is "JAVA does not support the const keyword, instead of const, final keyword is used".
	// illegal start of expression.
	System.out.println(a);
	
	System.out.println((byte)0Xff); // 0xff is the maximum value of a byte(127). And in Decimal maximum value of a byte is -1.

	
	
	System.out.println((int)(char)(byte) 0Xff);
	
	boolean ans=false;
	if(ans=true) {  //We can only go for this boolean value and we can't assign the other Datatype like int long others  
		System.out.println("done");	
	}
	else {
		System.out.println("not done");
	}
	
	
	int x=5,y;
	y=++x + x++ + --x;
	System.out.println(x+","+y);
	
   }

}
