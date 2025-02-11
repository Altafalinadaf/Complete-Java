package JavaImportantPrograms;

public class LeapYearOrNot {
	static boolean leapYear(int n) {
		boolean div4=(n%4==0);
		boolean div400=(n%400==0);
		boolean div100=(n%100==0);
		return (div4 && !div100)||div400;
	}
	public static void main(String[] args) {
		int num=2024;
		if(leapYear(num)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
