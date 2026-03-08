package PatternPrintting;

public class X_Pattern {
	public static void main(String[] args) {
		int size=7;
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size;col++) {
				if(row==col ||col == (size - row + 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		    }
			System.out.println();
		}
		
		
	}
			

}
