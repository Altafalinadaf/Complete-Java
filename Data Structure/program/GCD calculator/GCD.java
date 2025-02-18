import java.util.Scanner;

public class GCD {

    static int gcd(int a,int b){
        int min=0;
        if(a<b){
            min=a;
        }
        else {
            min=b;
        }

        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter 2 numbers : ");
       int a=scan.nextInt();
       int b=scan.nextInt();
       System.out.println("the gcd of "+a+" "+b+" is : "+gcd(a, b));
    }
}
