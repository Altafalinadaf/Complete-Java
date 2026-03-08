package Java_Programms;

public class LeapRange {
	static boolean leapYear(int n) {
		boolean div4=(n%4==0);
		boolean div400=(n%400==0);
		boolean div100=(n%100==0);
		return (div4 && !div100)||div400;
	}
	public static void main(String[] args) {
		
		for(int i=2001;i<=2100;i++) {
			if(leapYear(i)) {
				System.out.println(i+" Leap Year");
				//break;
			}
//			else {
//				System.out.println(i+"not a leap year");
//			}
		}
	}

}
