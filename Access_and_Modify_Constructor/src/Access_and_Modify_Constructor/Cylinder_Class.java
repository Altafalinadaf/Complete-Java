package Access_and_Modify_Constructor;

//create a class cylinder and use getter and setters to set its radius and height 

class Cylinder{
	private int radius;
	private int height;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	
	
	public void setHeight(int h) {
		height=h;
	}
	public int getHeight() {
		return height;
	}
	public double surfaceArea() {
		return  2 * 3.142 * radius * radius + 2 * 3.142 * radius *height; 
		// if you need the exact value of pi then you should use Math.pi
		
	}
	public double volume() {
		return 3.142*radius*radius*height;
	}
}

public class Cylinder_Class {
	public static void main(String[] args) {
		// problem 1
		// we can even directly call 
		Cylinder mycylinder=new Cylinder();
		mycylinder.setHeight(12);
		System.out.println(mycylinder.getHeight());
		
		// we can call like this also 
		mycylinder.setRadius(7);
		mycylinder.setRadius(8);
		System.out.println(mycylinder.getRadius());
		// or
//		int a=mycylinder.getRadius();
//		System.out.println(a);
		// problem 2 consider problem 1 in this problem
		// calculating the area of surface
		System.out.println(mycylinder.surfaceArea());
		System.out.println(mycylinder.volume());
		
	}

}
