package AccessModifier4;

class MyEmployee{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id =i;//  we can use the this.id=i; we can use this to assign to method 
		
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
	    this.name=n; // we can also use the this.name=n and also name=n; this mean we assign to this name to n
	}
}

public class Private_acess_modifier {
	public static void main(String[] args) {
		MyEmployee ali=new MyEmployee();
		//ali.id=77;
		ali.setName("codewithharry");
		ali.setId(51);
		System.out.println(ali.getName());
		System.out.println(ali.getId());
	}


}
