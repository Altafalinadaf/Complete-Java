package programs;

public class maxarrayinlist {
	public static void main(String args[]) {
		int[] arr= {0,88,99,45,50};
		int max=0;
		for (int element:arr) {
			if (element>max) {
				max=element;
			}
		}	
		System.out.println(max);
		
		
		int min=0;
		for (int e:arr) {
			if(e<min) {
				min=e;			
			}	
		}
		System.out.println(min);
	}

}

/*
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of array size : ");

        int num=scanner.nextInt();
        int[] arr=new int[num];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i;
        for(i=0;i<num;i++) {
            System.out.println("ENter the number " + i + " : ");
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(i=0;i<num;i++){
             if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the total array of elements ");

        for(int element:arr){
            System.out.print(""+element+" ");

        }
        System.out.println();
        System.out.println("the greastest number amoung is : "+max);
        System.out.println("the lowest number amoung is : "+min);
    }
}
*/
