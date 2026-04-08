package com.withoutgenericexample;
public class MainClass {
    public static void main(String[] args) {
        Box box=new Box();
        box.setValue(2);
        int i=(int)box.getValue();
        System.out.println(i);

        box.setValue("abc");
        String s=(String)box.getValue();
        System.out.println(s);

        // look at this example 
        /*  I have set the value as 5 and getting value using String type
         but still no compile time error for this because i'm using generic here 
         so generic is type safety
        
        */

        /* 
        // it will not show compile time error when we run the program it gives runtime error
        box.setValue(5);
        String s2=(String)box.getValue();
        float f2=(float)box.getValue();
        System.out.print(s2);
        System.out.println(f2);
        */
        
    }

}
