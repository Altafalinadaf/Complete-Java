package JavaImportantPrograms;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] arr= {1,3,1,4,3,5,6};
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			int k=i;
			for (int j = 0; j < arr.length; j++) {
				if (k==arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println(k);
			}
			
		}
	}

}
