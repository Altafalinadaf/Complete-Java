package basicProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListProject {
	public static void main(String[] args) {
		System.out.println("To Do List Project ");
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		ArrayList<String> tasks=new ArrayList<>();
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("-----Welcome to Menu------");
			System.out.println("1. for Add Task");
			System.out.println("2. for View Task");
			System.out.println("3. for Delete Task");
			System.out.println("4. for Exit From Loop");
			System.out.print("Please Enter your choice = ");
			int choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Thank you for choosing Add Task ");
				System.out.print("Please write the task = ");
				String task=scanner.nextLine();
				tasks.add(task);
				System.out.println("Task Successfully Added");
				break;
			case 2:
				System.out.println("Thank you for choosing View Task ");
				System.out.println("Your Tasks are : ");
				
				for (String list: tasks) {
					System.out.println(list);
				}
				
				break;
			case 3:
				System.out.println("Thank you for choosing Delete Task ");
				System.out.print("Which Task you want to Delete = ");
				int del=scanner.nextInt();
				try {
					tasks.remove(del-1);
				}
				catch (IndexOutOfBoundsException e) {
					// TODO: handle exception
					System.out.println("Invalid key");
				}
				break;
			case 4:
				System.out.println("Thank you for choosing Exit Task ");
				isTrue=false;
			default:
				System.out.println("Invalid input");
			}
		}
	}

}
