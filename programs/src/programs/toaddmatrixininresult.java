package programs;

public class toaddmatrixininresult {
	public static void main(String args[]) {
		int[][] mat1= {{1,2,3},
		              {4,5,6}};
		
		int[][] mat2= {{3,5,5},
	                   {4,8,7}};
		
		int[][] result= {{0,0,0},
	                     {0,0,0}};
		
		for (int i=0;i<mat1.length;i++) { // row number of times
			for (int j=0;j<mat2[i].length;j++) { // column number of times
					result[i][j]= mat1[i][j]+ mat2[i][j]; //ad mat 1 to mat 2
					System.out.print(result[i][j] + " " ); // " "=use for space perpose

				
			}
			System.out.println();// used of new lines
			
		}
		
	
	}

}
