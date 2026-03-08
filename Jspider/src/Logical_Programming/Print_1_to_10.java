package Logical_Programming;

//import java.util.Scanner;

public class Print_1_to_10 {


	//	static void Print(int start ,int end) {
//		for(int i=start;i<=end;i++) {
//			System.out.println(i);
//		}
//	}
//	public static void main(String[] args) {
//		Print(1, 10);
//	}
//
//}
//	public static void main(String args[]){
//        int[] arr={8,6,3,9,5,1,7,4,2,10};
//        int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//       for(int i=0;i<arr.length;i++){
//                if(max<arr[i]){
//                      max=arr[i];
//                } 
//                else if(min>arr[i]){
//                     min=arr[i];
//                  }
//           }
//         System.out.println(max+min);
//    }
//}


//    public static void main(String args[]){
////    Scanner sc=new Scanner(System.in);
////    int a=sc.nextInt();
////    int b=sc.nextInt();
//   
//     for (int i=1;i<=100;i++){
//        int num=i;
//        int sum=0;
//         for(int j=1;j<num;j++){
//              if(num%j==0){  
//                    sum=sum+j;
//               }
//          }
//          if(num==sum){
//                  System.out.println(num+"Number is perfect number");
//           }
//          
//       }
//}
//}  
	 public static void main(String args[]){
         int[] arr={1,2,3,4,5,6,7,8,9};
         rotateRight(arr,3);
      }
     static void rotateRight(int[] arr,int times){
             for(int j=1;j<=times;j++){
                  int temp=arr[arr.length-1];
                  for(int i=arr.length-1;i>0;i--){
                         arr[i]=arr[i-1];
                 }
                 arr[0]=temp;
              }
              for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
             }
     }
}
