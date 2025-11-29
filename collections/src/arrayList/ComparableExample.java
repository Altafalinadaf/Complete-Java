package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
	String name;
	double cgpa;
	public Student(String name,double cgpa) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.cgpa=cgpa;
		
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public String getName() {
		return name;
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Ali",7.5));
		list.add(new Student("sudeep", 8.9));
		list.add(new Student("Raju", 5.6));
		System.out.println(list);
		
		Comparator<Student> comparator=Comparator.comparing(Student::getCgpa).reversed();
		list.sort(comparator);
		System.out.println(list);
		
		for(Student s : list){
			System.out.println("Name = "+s.getName() + "CGPA = "+s.getCgpa());
		}
		
		
	}

}
