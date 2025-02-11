package HackerRankPrograms;

import java.util.Scanner;

public class Program5 {
    
	 public static void Parallelogram(int b,int h){
         if(b>0 && h>0){
             System.out.println(h*b);
         }
         else{
             System.out.println("java.lang.Exception: Breadth and height must be positive");
         }
     }

     public static void main(String[] args) {
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc=new Scanner(System.in);
          int b=sc.nextInt();
          int h=sc.nextInt();
          Parallelogram(b,h);
          sc.close();
        
     }    

}
