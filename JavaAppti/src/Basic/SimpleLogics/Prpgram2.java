package Basic.SimpleLogics;
/*
 * n the program, the operators are just for puzzle someone. 
 * The operators are neither pre or post increment. The statement can be written and solved as follows:

int i=20+ (+9)- (-12)+ (+4)- (-13)+ (+19);

i=20+9+12+4+13+19

i=77
 */

public class Prpgram2 {
	public static void main(String[] args) {
		int x=20+ +9- -2; // we think it's 27 but it's not 
		System.out.println(x);
		
		int i=20+ +9- -12+ +4- -13+ +19;  
		System.out.println(i);  
		
	}

}
