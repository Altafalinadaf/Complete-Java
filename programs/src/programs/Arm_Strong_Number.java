package programs;

import java.util.Scanner;
/*
 * Math.log10(num): This calculates the logarithm (base 10) of the value of num. For example:

If num is 100, then Math.log10(100) will be 2.0 because log10(100) = 2.
If num is 1000, then Math.log10(1000) will be 3.0 because log10(1000) = 3.
(int) Math.log10(num): The result of Math.log10(num) is a floating-point value (double). By casting it to an int, the decimal part is truncated, and the integer part is retained. For example:

If num is 100, then (int) 2.0 will be 2.
If num is 1000, then (int) 3.0 will be 3.
(int) Math.log10(num) + 1: Finally, we add 1 to the truncated integer value to get the total number of digits. For example:

If num is 100, then 2 + 1 will be 3, which is the correct number of digits (100 has three digits).
If num is 1000, then 3 + 1 will be 4, which is the correct number of digits (1000 has four digits).
 */

public class Arm_Strong_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int temp = num;
        
        int count = 0;
        int numDigits = (int) Math.log10(num) + 1; // Calculate the number of digits using log10

        while (num > 0) {
            int digit = num % 10;
            count += Math.pow(digit, numDigits);
            num /= 10 ;
        }

        if (temp == count) {
            System.out.println("The given number is an Armstrong Number: " + count);
        } else {
            System.out.println("The given number is not an Armstrong number " );
        }

        scanner.close();
		
		
	}

}
