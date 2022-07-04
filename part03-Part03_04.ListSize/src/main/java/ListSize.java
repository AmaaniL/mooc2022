
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("")) {
                break;
            }

            list.add(in);
        }
System.out.println("In total: " + list.size());
    }
}
