
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team");
        String team = scan.nextLine();
        int count = 0;
        int win = 0;


        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                teams.add(line);

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];

                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam)) {
                    count++;
                }
                if (team.equals(awayTeam)) {
                    count++;
                }
                if ((team.equals(homeTeam)) && (homeScore > awayScore)){
                win++;}
                if ((team.equals(awayTeam)) && (homeScore < awayScore)) 
                    win++;
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + (count-win));

        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
