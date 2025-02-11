package topicopps;

//1.Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
//2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
//3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//4.Create a class Rectangle & problem 3.
//5.Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
//6.Repeat problem 4 for a circle.

class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



class Cellphone{
	public void ring() {
		System.out.println("Ringing...........");
	}
	public void vibrate() {
		System.out.println("Vibrating>>>>>>>>>>");
	}
	public void call() {
		System.out.println("Calling to SA????????");
	}
}

class Square{
	int side;
	public int area() {
		// area is multiple of square (a^2)(ex: in square there are 2 area of half )
		return side*side;
		
	}
	public int perimeter() {
		// perimeter is a multiple of 4 (4*a) (ex: in square there of 4 points of perimeter)
		return 4*side;
	}
}

class Rectangle{
	int l; // length 
	int w; // width
	public int area() {
		return l*w;
	}
	public int perimeter() {
		return 2*(l+w);
	}
}

class TommyVecetti{
	public void hit() {
		System.out.println("Hitting the enemy ");
	}
	public void run() {
		System.out.println("Running from the enemy");
    }
	public void fire() {
		System.out.println("Firing on enemy");
	}
}

class Circle{
	float pi =3.141f; 
	float r; // radius
    public float area() {
    	return pi*(r*r);
    }
    public float perimeter() {
    	return  (2*(pi*r));
    }
    
}

public class Getingandsetting {
    public static void main(String[] args) {
    	
        System.out.println("Class 1");
        //Problem 1
        employee harry = new employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
        
        // Problem 2
        System.out.println("Class 2 ");
        Cellphone Redmi =new Cellphone();
        Redmi.ring();
        Redmi.vibrate();
        Redmi.call();
        
        // Problem 3
        System.out.println("Class 3");
        Square sq=new Square();
        sq.side=4;
        System.out.println(sq.area()); 
        System.out.println(sq.perimeter());
        
        // Problem 4
        System.out.println("Class 4");
        Rectangle rc=new Rectangle();
        rc.l=4;
        rc.w=2;
        System.out.println(rc.area());
        System.out.println(rc.perimeter()); 
        
        // Problem 5
        System.out.println("Class 5");
        TommyVecetti player1=new TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();
        
        // Problem 6
        Circle cr=new Circle();
        cr.r=4;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
        
        
    }
}
