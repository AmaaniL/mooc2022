
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        
        // and prints it.
                ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        double sum = 0;

        // toteuta listan lukujen summan laskeminen tänne
        for (Integer input : list) {

            sum = sum + input;

        }
        System.out.println("Average: " + sum/list.size());

    }
}
