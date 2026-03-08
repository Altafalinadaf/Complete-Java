
import java.util.Scanner;

public class EuclidGCD {

    static int euclidGCD(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
           
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of"+a+""+b+" is : "+euclidGCD(a, b));

    }
}
