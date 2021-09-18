import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;

public class jsonParsing {
    public static void addCardToJson(Card card) {
        // TODO: Check if file exists
        JSONObject cardObj = new JSONObject();
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("./cards.json");) {
            JSONObject cards = (JSONObject) parser.parse(reader);
            cardObj.put("question", card.getQuestion());
            cardObj.put("answer", card.getAnswer());
            cardObj.put("reviewTimeAndDate", card.getReviewTimeAndDate());
            cardObj.put("srsLevel", card.getSrsLevel());

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

    public static String[] readCardFromJson(String cardName) {
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("./cards.json")) {

            JSONObject cards = (JSONObject) parser.parse(reader);
            JSONObject card = (JSONObject) cards.get(cardName);

            String question = (String) card.get("question");
            String answer = (String) card.get("answer");
            String reviewTimeAndDate = (String) card.get("reviewTimeAndDate");
            String srsLevel = (String) card.get("srsLevel");

            String[] info = {cardName, question, answer, reviewTimeAndDate, srsLevel};
            return info;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // TODO: Could be done better
        String[] info = {"", "", "", "", ""};
        return info;
    }

    public static String needToStudy(int currentTime) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("./cards.json"));

        JSONObject jsonObject = (JSONObject) obj;

        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            JSONObject card = (JSONObject) jsonObject.get(key);

            String cardName = (String) key;
            String reviewTimeAndDate = (String) card.get("reviewTimeAndDate");
            if (Integer.parseInt(reviewTimeAndDate) <= currentTime) {
                return cardName;
            }

        }
        return null;
    }

}
