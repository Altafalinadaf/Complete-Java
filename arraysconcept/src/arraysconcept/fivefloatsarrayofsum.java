package arraysconcept;

public class fivefloatsarrayofsum {
	public static void main(String args[]) {
		float[] numbers= {25.85f,95.25f,45.25f,95.95f,87.285f};
		int sum=0;
		for (float number:numbers) {
			sum +=number;
			
		}
		System.out.printf("the value of sum is "+sum);
		
	}

}
