package LC_04_08_23;
// Range of Prime Number

public class ph {
	 public static void main(String args[]){    
	       int num=8;
	       for(int i=num;i<1000;i++){
	          int num1=i+1;
	          int count=0;
	          for(int j=1;j<=num1;j++){
	               if(num1%j==0){
	                   count++;
	                }
	              
	          }
	          if(count==2){
                  System.out.println(num1);
                  
               }
	       
	     }
	 }
}
