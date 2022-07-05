
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        while (input != 0) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            count = count + 1;
        }
        System.out.println("Number of numbers: " + count);
    }
}
