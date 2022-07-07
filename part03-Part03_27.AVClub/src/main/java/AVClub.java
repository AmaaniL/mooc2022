
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 while(true){
            String userText = scanner.nextLine();
            if(userText.isEmpty()){
                break;
            }
            String[] userAv = userText.split(" ");
            for(int i = 0; i < userAv.length; i++){
                if(userAv[i].contains("av")){
                    System.out.println(userAv[i]);
                }
            }
        }
        
    }
}
