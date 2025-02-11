package String_07_08_2023;
 
//1.input=xy332 cd112  output : 44
//2.input=abc123xyz  output : 123
//3.input=7 11 output=18

public class Program2 {
	static void convertCharArray() {
        String s1 = "xy33z cd112";
        String s2 = s1.replaceAll("\\D", " "); // Replace all non-digit characters with space
        String[] strings = s2.trim().split("\\s+"); // Split the string by spaces and remove leading/trailing spaces
        int sum = 0;
        System.out.println(s2);

        for (int i = 0; i < strings.length; i++) {
            int number = Integer.parseInt(strings[i]);
            while (number > 0) {
                sum += number % 10; // Extract the last digit and add it to the sum
                number /= 10; // Remove the last digit from the number
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        convertCharArray();
    }
}