import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    public static void main(String[] args) throws IOException, ParseException {
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
                study();
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

        // dateInMin() is going to have an issue of edge case at end of the year that will cause issues.
        String currentTime = String.valueOf(Date.dateInMin());

        Card card = new Card(cardName, question, answer, currentTime, "0");
        jsonParsing.addCardToJson(card);
    }

    public static void study() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        int nowTotalMin = Date.dateInMin();
        String cardName = jsonParsing.needToStudy(nowTotalMin);
        if (cardName == null) {
            System.out.println("No cards to review!");
            return;
        }
        String[] cardData = jsonParsing.readCardFromJson(cardName);
        // cardData looks like {cardName, question, answer, reviewTimeAndDate, srsLevel}
        System.out.println("Question: " + cardData[1]);
        System.out.println("Press enter when you have thought of the answer.");
        scanner.nextLine();
        System.out.println("The answer is: " + cardData[2]);

        // TODO: Get user's answer and print it out under the actual answer so the user can see the difference

        int increment = 0;
        int srsLevel = Integer.parseInt(cardData[4]);
        int nextSrsLevel = Integer.parseInt(cardData[4]);
        while (true) {
            System.out.println("Was your answer correct? (Y/N)");
            String answerCorrect = scanner.nextLine().toUpperCase();
            if (answerCorrect.equals("Y")) {
                nextSrsLevel += 1;
                break;
            } else if (answerCorrect.equals("N")) {
                if (srsLevel == 0) {

                } else {
                    srsLevel--;
                    nextSrsLevel = srsLevel;
                }
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }

        switch (srsLevel) {
            case 0:
                increment += 60;
                break;
            case 1:
                increment += 120;
                break;
            case 2:
                increment += 240;
                break;
            case 3:
                increment += 480;
                break;
            default:
                System.out.println("Congrats, you have already mastered this card!");
                increment += 1000000;
                // TODO: Remove card from json
                break;
        }
        if (srsLevel+1 > 3) {
            // TODO: Remove card from json
        }

        Card card = new Card(cardData[0], cardData[1], cardData[2], String.valueOf(Date.dateInMin() + increment), String.valueOf(nextSrsLevel));
        jsonParsing.addCardToJson(card);

    }
    // TODO: Allow users to edit flashcards
}
