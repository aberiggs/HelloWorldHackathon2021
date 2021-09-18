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
            // TODO: wrap in while.
            if (studyOrCreate.equals("C")) {
                //createCard();
                System.out.println("You are creating a card");
            } else if (studyOrCreate.equals("S")) {
                //study();
                System.out.println("You are studying");
            } else {
                System.out.println("Invalid input!");
            }
            System.out.println("Do you want to exit? Y/N");
            String exit = scanner.nextLine().toUpperCase();
            if (exit.equals("N")) {
                break;
            }


        }
        // SRS System: Levels/times

        // Get current time and date

        // Create Object Card (question, answer, timeReviewUnlocks, srs level)
        //getTimeAndDate();
        hours();

    }

    public static void createCard() {
        Scanner scanner = new Scanner(System.in);

        String cardName = scanner.nextLine();

        String question = scanner.nextLine();

        String answer = scanner.nextLine();

        Card card = new Card(cardName, question, answer, date(), hours(), minutes(), 0);
    }

    public static void study() {
        //
    }
    public static String date(){
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String hoursInt = partTwo.substring(0, 2);
        String minutesInt = partTwo.substring(3);
        nowDate = partOne + " " + partTwo;
        System.out.println(nowDate);
        return nowDate;
    }

    public static int hours() {
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String hoursInt = partTwo.substring(0, 2);
        int hour = Integer. parseInt(hoursInt);
        System.out.println(hour);
        return hour;

    }

    public static int minutes() {
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String minutesInt = partTwo.substring(3);
        int minutes = Integer. parseInt(minutesInt);
        System.out.println(minutes);
        return minutes;
    }
}
