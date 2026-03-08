package Constructors;


class employee1{
	private int id;
	private String name;
	
	// inside the class  we use constructor, constructor name should be same as class name 
	// there is no return type for this constructor 
	// it invoke directly.. compiler know it's constructor user want to print this 
	// it automatically invoke (like no need to call no need say no need to create)
	
	// why it's run automatically because it's constructor..the class name is same as constructor
	// when we use same name then compiler say o then i have to check employe1 class and execute it
	// whenever we use the private method we need to use setter and getter 
	
	
	// default constructor
	public employee1() {
		id=45;
		name="AliWithCoding";
			
	}
		                
        // Setter and Getter
        public void setName(String n) {
    		name=n;
    	}
    	public String getName() {
    		return name;
    	}
    	public void setId(int i) {
    		id=i;
    	}
    	public int getId() {
    		return id;
    	}
}
public class Constructor1 {
	public static void main(String[] args) {
		employee1 harry=new employee1();
		/*
		 for example if i want to add one more sring and id then once again i have to write setname=name setid=12 
		 and then use getname for accessing the value it's take to time to write that's why we use the constructor 
		 to access directly without writing many times 
		 
		 example: if we have 10 record then what we again again call the method it's take time so we go for constructor 
		 to acess in one line
		 
		 // this private method is used without using the constructor 
		emp1.setName("AliWithCoding");
		emp1.setId(01);
		System.out.println(harry.getId());
		System.out.println(harry.getName());
		*/
		
		/* there are 2 types of constructor 
		 * 1.Default Constructor 
		 * 2.Parameterized Constructor
		 */ 
		 
		// calling the constructor by using "employee emp1=new employee();" using constructor 
		// 1.Default Constructor 
		System.out.println(harry.getId());
		System.out.println(harry.getName());
		
		
	}
}
