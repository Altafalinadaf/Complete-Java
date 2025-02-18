import java.util.Scanner;

public class BestLCMProgram {

    static int lcm(int a,int b){
        return (a*b)/gcd(a, b);
    }

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
        System.out.println("enter 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The LCM of "+a+" "+b+" is "+lcm(a, b));

    }
}
