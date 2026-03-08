package Constructors;

class employee3{
	private int id;
	private String name;
	private int id1;
	
	// method OverLoading is also done in Constructor
	public employee3(int myId,String myName,int myId1) {
		id=myId;
		name=myName;
		id1=myId1;
	}
	
	// here is a another class of Constructor 
	public employee3() {
		id=02;
		name="CodeWithHarry";
	}
	
	
	public void setId(int i) {
		id =i;
	}
	public void setName(String n) {
		name=n;
	}
	public int getId() {
		return id;
	}
	public String getName() {
	    return name;
	}
	public void setId1(int j) {
		id1=j;
	}
	public int getId1() {
		return id1;
	}
	
}

public class Constructor_Overloading {
	public static void main(String[] args) {
		employee3 ali=new employee3(01, "AliWithCoding",12);		
		System.out.println(ali.getId());
		System.out.println(ali.getName());
		System.out.println(ali.getId1());
		
	}
	

}
