
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLetter = 0;
        String longestName = "";
        double average = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            if (numberOfLetter < parts[0].length()) {
                numberOfLetter = parts[0].length();
                longestName = parts[0];
            }

        } //while         
        if (count != 0) {
            average = 1.0 * sum / count;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
