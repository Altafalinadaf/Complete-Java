package Own_Class_OOPs_concepts;


class employee123{
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
public class getset {
	

	 public static void main(String[] args) {
		//Problem 1
		employee123 harry = new employee123();
	    harry.setName("CodeWithHarry");
	    harry.salary = 233;
	    System.out.println(harry.getSalary());
	    System.out.println(harry.getName());
		 
	 }
}
