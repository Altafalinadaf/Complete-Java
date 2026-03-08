package methods;

public class methodscreation {
	static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        y=30;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
       // System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
        int a2=6;
        int b2=4;
        int c2;
        c2=logic(a2,b2);
        System.out.println(c2);
    }

}
