package Logical_Programming;

public class Even_1_to_10 {
	
	static void even(int star,int end) {
		for(int i=star;i<=end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		even(1, 10);
	}

}
