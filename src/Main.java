import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User Input: Study or Create Card
        while (true) {
            System.out.println("Do you want to study or create a new card. ");
            System.out.println("Enter 'S' to study and 'C' to create a new card");
            String studyOrCreate = scanner.nextLine().toUpperCase();
            if (studyOrCreate.equals("C")) {
                System.out.println("You are creating a card");
                createCard();
            } else if (studyOrCreate.equals("S")) {
                //study();
                System.out.println("You are studying");
            } else {
                System.out.println("Invalid input!");
            }
            System.out.println("Do you want to exit? Y/N");
            String exit = scanner.nextLine().toUpperCase();
            if (exit.equals("Y")) {
                break;
            }


        }


    }

    public static void createCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your flashcard: ");
        String cardName = scanner.nextLine();
        System.out.println("Enter the question for your flashcard: ");
        String question = scanner.nextLine();
        System.out.println("Enter the answer for the question: ");
        String answer = scanner.nextLine();

        Card card = new Card(cardName, question, answer, Date.date(), Date.hours(), Date.minutes(), 0);
        jsonParsing.addCardToJson(card);
    }

    public static void study() {
        // TODO
    }

}
