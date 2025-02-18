
import java.util.Scanner;

public class BestGCD {

    static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of"+a+""+b+" is : "+gcd(a, b));

    }
}
