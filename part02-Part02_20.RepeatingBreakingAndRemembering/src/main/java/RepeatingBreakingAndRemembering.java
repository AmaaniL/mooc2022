
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
Scanner x = new Scanner(System.in);
System.out.print("Customer number: ");
int y = Integer.valueOf(x.nextLine());

if (y >= 1000 && y % 25 == 0) {
    System.out.println("Gets a gift card!");
} else if (y % 2000 == 0) {
    System.out.println("Gets a large gift card!");
} else {
    System.out.println("Gets nothing.");
}
    }
}
