package Logical_Programming;

public class Print1_10_to_1 {
	static void printrange(int start,int end)
	{
		for(int i=start;i>=end;i--)
			if(i%2==0){
				System.out.println(i);
			}
	
	}
	public static void main(String[] args) {
		printrange(10, 1);
	}
	
	

}
