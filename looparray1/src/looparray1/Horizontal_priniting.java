package looparray1;

public class Horizontal_priniting {
	public static void main(String[] args) {
		System.out.println("hi 1 to 5");
		int i=1;
		while(i<=5) {
			System.out.print("hi"+i+" ");
			i++;
		}
		System.out.println();
		System.out.println("ok2 to ok6");
		int i1=2;
		while(i<=6) {
			System.out.print("ok"+i1+" ");
			i++;
		}
		System.out.println();
		int i3=1;
		while(i3<=5) {
			if(i3%2==0) {
				System.out.print("ok"+i3+" ");
			}
			else {
				System.out.print("hi"+i3+" ");
			}	
			i3++;
		}
		
		System.out.println();
		int i4=5;
		while(i4>=3) {
			System.out.print("ok"+i4+" ");
			
			i4--;
		}
		int i5=4;
		while(i5<=5) {
			System.out.print("hi"+i5+" ");
			i5++;
		}
		
		System.out.println();
		int i6=1;
		while(i6<=12) {
			if(i6%2==0) {
				System.out.print("ok"+i6+" ");
			}
			i6++;
		}
		
		System.out.println();
		int i7=5;
		while(i7>=2) {
			if(i7%2==0) {
				System.out.print("ok"+i7+"hi"+" ");
			}
			else {
				System.out.print("ok"+i7+"hi"+" ");
			}	
			i7--;
		}
		
		System.out.println();
		int i8=1;
		while(i8<=4) {
			if(i8<=2) {
				System.out.print("hi"+i8+"ok"+" ");
			}
			else {
				System.out.print("ok"+i8+"hi"+" ");
			}	
			i8++;
		}
		
		System.out.println();
		int i9=1;
		while(i9<=6) {
			if(i9%2==0) {
				System.out.print(i9+"Hi"+" ");
			}
			else {
				System.out.print(i9+"ok"+" ");
			}	
			i9++;
		}
		
		
		
	}

}
