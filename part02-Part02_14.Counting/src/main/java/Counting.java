
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input = Integer.valueOf(scanner.nextLine());
        
        while (input >= count) {
            System.out.println(count);
            count++;
        }
                

    }
}
