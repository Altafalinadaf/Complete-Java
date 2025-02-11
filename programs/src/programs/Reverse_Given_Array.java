package programs;

import java.util.Scanner;

public class Reverse_Given_Array {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter the Size Of array : ");
        int num=scanner.nextInt();
        int[] arr=new int[num];
        int l= arr.length;
        int n=Math.floorDiv(l,2);

        for(int i=0;i<num;i++){
            System.out.println("Enter the "+i+ " number : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("The array list is : ");
        for(int j=0;j<num;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        for(int k=0;k<n;k++){
            temp = arr[k];
            arr[k] = arr[l-k-1];
            arr[l-k-1] = temp;
        }
        System.out.println("The reverse array is : ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();

    }

}



/*
Here, n represents the size of the array arr, and l is assumed to be the length of the array.

Let's consider an example array arr with elements [1, 2, 3, 4, 5]. In this case, n would be 5, and l would also be 5.

Iteration 1 (i = 0):

temp is initialized to arr[0], which is 1.
arr[0] is assigned the value of arr[l - i - 1], which is arr[5 - 0 - 1] or arr[4], i.e., 5.
arr[4] is assigned the value of temp, which is 1.
After the swap, the array becomes [5, 2, 3, 4, 1].
Iteration 2 (i = 1):

temp is initialized to arr[1], which is 2.
arr[1] is assigned the value of arr[l - i - 1], which is arr[5 - 1 - 1] or arr[3], i.e., 4.
arr[3] is assigned the value of temp, which is 2.
After the swap, the array becomes [5, 4, 3, 2, 1].
Iteration 3 (i = 2):

temp is initialized to arr[2], which is 3.
arr[2] is assigned the value of arr[l - i - 1], which is arr[5 - 2 - 1] or arr[2], i.e., 3.
arr[2] remains the same as temp.
After this iteration, the array remains unchanged as [5, 4, 3, 2, 1].
The loop terminates after three iterations since n is equal to 5, and we only need to swap the first
half of the array with the second half. In this example, the final array after the loop would be [5, 4, 3, 2, 1]
*/