
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();

        if(user.equals("alex")){
            if(password.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        } else if(user.equals("emma")){
            if(password.equals("haskell")){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        } else{
             System.out.println("Incorrect username or password!");
        }
    }
}
 