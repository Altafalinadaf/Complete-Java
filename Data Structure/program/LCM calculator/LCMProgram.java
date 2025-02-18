
import java.util.Scanner;

public class LCMProgram {

    public static int lcm(int a,int b){
        int res=Math.max(a, b);
        System.out.println(res);

        while (true) { 
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("The LCM of "+a+" "+b+" is "+lcm(a, b));
        

    }
}
