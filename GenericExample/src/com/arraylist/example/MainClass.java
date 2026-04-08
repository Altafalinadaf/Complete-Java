package com.arraylist.example;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // here i can store any data type
        // i can store String, int and float

        /*
        Before generic :
-	No type safety 
-	Manual type casting
-	No compile time checking

         */

        ArrayList arrays = new ArrayList();
        arrays.add("Abc");
        arrays.add(23);
        arrays.add(23.56);

        String object = (String) arrays.get(0);
        Integer obj2 = (Integer) arrays.get(1);
        Object object3 = arrays.get(2);
        System.out.println(object + " " + obj2 + " " + object3);
        System.out.println(object3.getClass()); // belongs to Double class

        // after generic
        // generic is release in java 5 features
        // we can only store String type
        // type safety - like only string can store
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        // we can see here compile time error
        // list.add(67); // we can only store string 

        // No manual type casting
        String string = list.get(0);
        String string2 = list.get(1);
        // we will get compile time error if type mis-match
        // Integer sInteger = list.get(1);

        // object class is the super most class
        Object obj=list.get(1); 
        System.out.println(obj);
    }
}
