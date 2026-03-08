package AccessModifier4;


import java.util.Scanner;

class Circle{
	float pi=3.141f;
	float r;
	public float area() {
		return pi*(r*r);
	}
	public float perimeter() {
		return  (2*(pi*r));
	}
	
}

class Circle1{
	private float pi=3.141f;
	float r1;
	
    public  float getArea1() {
		return pi*(r1*r1);
		
	}
    double n1=pi*(r1*r1);
	public void setArea1(float n) {
		n1=n;
	}
	public float getPerimeter() {
		return (2*(pi*r1));
	}
    double n3=(2*(pi*r1)); 
	public void setPerimeter(float n2) {
		 n3=n1;
	}
}

public class CirclePrivate_Acess_Modifier {
	public static void main(String[] args) {
		// this is the public access modifier
		Circle cr=new Circle();
		System.out.print("Enter the Radius of Circle : ");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		cr.r=radius;
		System.out.println("the area of Circle is : "+cr.area());
		System.out.println("The Perimeter of Circle is : "+cr.perimeter());
		
		// this is the private access modifier
		Circle1 cr1=new Circle1();
		System.out.print("Enter the Radius of Circle : ");
		float rad=sc.nextInt();
		cr1.r1=rad;
		cr1.setArea1(rad);
		cr1.setPerimeter(rad);
		System.out.println("The Circle1 of Area1 is : "+cr1.getArea1());
		System.out.println("The Circle1 of Perimeter1 is : "+cr1.getPerimeter());
		sc.close();
		
        
	}

}
