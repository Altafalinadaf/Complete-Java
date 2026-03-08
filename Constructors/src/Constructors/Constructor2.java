package Constructors;
class employee2 {
	private int id;
	private String name;
	
	/* there are 2 types of constructor 
	 * 1.Default Constructor 
	 * 2.Parameterized Constructor
	 */ 
	
	// 2. Parameterized Constructor 
	
	public employee2(int myId,String myName) {
		id=myId;
		name=myName;
	}
	
	public void setName(String n) {
		name =n;
	}
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

public class Constructor2 {
	public static void main(String[] args) {
		employee2 ali=new employee2(02, "AliWithCoding");
		
		System.out.println(ali.getId());
		System.out.println(ali.getName());
	}

}
