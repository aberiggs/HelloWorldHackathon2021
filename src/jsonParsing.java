import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class jsonParsing {
    public static void addCardToJson(Card card) {
        JSONObject cardObj = new JSONObject();
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("./cards.json");) {
            JSONObject cards = (JSONObject) parser.parse(reader);
            // cardObj.put("name", card.getName());
            cardObj.put("question", card.getQuestion());
            cardObj.put("answer", card.getAnswer());
            // cardObj.put("reviewTimeAndDate", card.getReviewTimeAndDate);
            // cardObj.put("srsLevel", card.getSrsLevel);

            cards.put(card.getName(), cardObj);

            try (FileWriter file = new FileWriter("./cards.json")) {
                file.write(cards.toJSONString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public static String[] readCardFromJson(String name) {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("./cards.json")) {

            JSONObject cards = (JSONObject) parser.parse(reader);

            System.out.println(cards);

            JSONObject card = (JSONObject) cards.get(name);

            System.out.println(card);

            String question = (String) card.get("question");
            String answer = (String) card.get("answer");
            String reviewTimeAndDate = (String) card.get("reviewTimeAndDate");
            String srsLevel = (String) card.get("srsLevel");

            String[] info = {name, question, answer, reviewTimeAndDate, srsLevel};
            return info;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String[] info = {"", "", "", "", ""};
        return info;
    }
}
