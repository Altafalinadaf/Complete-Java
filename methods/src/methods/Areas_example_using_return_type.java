package methods;

public class Areas_example_using_return_type {
	    static double Triangle(int b,int h){
			   
			   double area=0.5*b*h;
			   System.out.println("The Triangle of area is : " +area);
				return area;  
		   }
			 
		   static int Square(int a){
			   int square=a*a;
			   System.out.println("The Square of area is  : "+square);
			   return square;
		   }

		   static int Rectangle(int w,int h){ 
			   int area=w*h;
			   System.out.println("The Rectangle of area is : "+area);
			   return area;
			   
		   }
		    
		    static int Parallelogram(int b,int v){
				int area=b*v;
				System.out.println("The Parallelogram of area is : "+area);
				return 0;

			}
			static double TrapeZoid(int h,int b1,int b2){
				
				double area=((b1+b2)/2)*h;

				System.out.println("The Trape Zoid of area is  : "+area);
				return area;
			}
			
			static double Circle(int r){
				double pi=3.142;
				double area=pi*r*r;
				System.out.println("The Area of Circle is : "+area);
				return area;
			}

			static double Ellipse(int a,int b){
				double pi=3.142;
				double area=pi*a*b;
				System.out.println("The area of Ellipse is : "+area);
				return area;
			}
			static double Sector(int r,int tita){
				double area=0.5*r*r*tita;
				System.out.println("The area of Sector is : "+area);
				return area;
			}
			
		public static void main(String[] args) {  
			Triangle(4,5);
			Square(4);
			Rectangle(4,6);
			Parallelogram(4,8);
			TrapeZoid(3,2,5);
			Circle(8);
			Ellipse(4,8);
			Sector(4,60);
			
			
			
		}


}
