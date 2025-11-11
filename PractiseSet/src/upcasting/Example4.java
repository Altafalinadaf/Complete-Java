package upcasting;
class A3 {
    void show() { System.out.println("A2 show"); }
}

class B3 extends A3 {
    void show() { System.out.println("B2 show"); }
    void bMethod() { System.out.println("B2 method"); }
}

class C3 extends A3 {
    void show() { System.out.println("C2 show"); }
    void cMethod() { System.out.println("C2 method"); }
}

public class Example4 {
	public static void main(String[] args) {
        A3[] arr = {new B3(), new C3()}; // Array of superclass type
        for (A3 obj : arr) {
            obj.show();   // ✅ Works for all subclasses (polymorphism)
            // obj.bMethod(); ❌ Won’t compile
        }
        
        for (A3 obj : arr) {
            if (obj instanceof B3) {
                ((B3)obj).bMethod();
            }
        }

    }
}

