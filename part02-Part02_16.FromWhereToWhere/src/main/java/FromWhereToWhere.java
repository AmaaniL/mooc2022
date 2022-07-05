
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int count = 1;
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        count = Integer.valueOf(scanner.nextLine());
        while (count <= input) {
            System.out.println(count);
            count++;
        }

    }
}
