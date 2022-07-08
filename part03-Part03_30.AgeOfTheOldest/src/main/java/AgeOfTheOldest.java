
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestage = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");

            if (oldestage < Integer.valueOf(parts[1])) {
                oldestage = Integer.valueOf(parts[1]);
            }
            

        }//while
        System.out.println("Age of the oldest:" + oldestage);
    }
}
