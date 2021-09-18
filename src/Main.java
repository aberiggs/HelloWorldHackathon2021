import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User Input: Study or Create Card
        System.out.println("Do you want to study or create a new card ('S'/'C')");
        String studyOrCreate = scanner.nextLine();
        if (studyOrCreate == "C") {

        }

        // SRS System: Levels/times

        // Get current time and date

        // Create Object Card (question, answer, timeReviewUnlocks, srs level)


    }
    public static void createCard() {
        Scanner scanner = new Scanner(System.in);
        String cardName = scanner.nextLine();
        String question = scanner.nextLine();
        String answer = scanner.nextLine();


        // Card card = new Card(question, answer);
    }
}
