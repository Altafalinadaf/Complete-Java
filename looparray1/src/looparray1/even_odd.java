package looparray1;

public class even_odd {
     public static void main(String[] args) {
		System.out.println("1 to 10 ");
		int n=1;
		while(n<=10) {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}
		System.out.println("10 to 1 ");
		int n2=10;
		while(n2>=1) {
			if(n2%2==0) {
				System.out.println(n2);
			}
			n2--;
		}
		System.out.println("21 to 31 ");
		int n1=21;
		while(n1<=31) {
			if(n1%2==0) {
				System.out.println(n1);
			}
			n1++;
		}
		
		System.out.println("ODD NUMBER LIST BELOW");
		System.out.println("************************************");
		System.out.println("1 to 10 ");
		int n3=1;
		while(n3<=10) {
			if(n3%2!=0) {
				System.out.println(n3);
			}
			n3++;
		}
		System.out.println("10 to 1 ");
		int n4=10;
		while(n4>=1) {
			if(n4%2!=0) {
				System.out.println(n4);
			}
			n4--;
		}
		System.out.println("36 to 76 ");
		int n5=36;
		while(n5<=76) {
			if(n5%2!=0) {
				System.out.println(n5);
			}
			n5++;
		}
		System.out.println("81 to 41 ");
		int n6=81;
		while(n6>=41) {
			if(n6%2!=0) {
				System.out.println(n6);
			}
			n6--;
		}
	}
}
