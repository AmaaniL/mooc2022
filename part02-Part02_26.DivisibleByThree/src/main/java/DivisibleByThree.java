
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 28);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int count = beginning; count <= end; count++) {
            if (count % 3 == 0) {
                System.out.println(count);
            }
        }
    }

}
